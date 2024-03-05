package cn.isning.zxingkmp

import com.google.zxing.DecodeHintType
import com.google.zxing.MultiFormatReader
import kotlin.properties.Delegates

actual class BarcodeReader actual constructor(private val options: ReaderOptions) {
    private val reader = MultiFormatReader().also { it.setHints(options.asHints) }

    // TODO: Currently zxing only supports one barcode per image: https://github.com/ISNing/ZXingKMP/issues/8
    @Throws(BarcodeReadingException::class)
    actual fun read(imageView: ImageView): List<Barcode> =
        reader.decodeWithState(imageView.toBinaryBitmap(options.binarizer)).let {
            listOf(Barcode(it, options.eanAddOnSymbol))
        }
}

actual class ReaderOptions {
    actual var tryHarder: Boolean by Delegates.observable(false) { _, _, newValue ->
        if (newValue) hints[DecodeHintType.TRY_HARDER] = true
        else hints.remove(DecodeHintType.TRY_HARDER)
    }
    actual var tryInvert: Boolean by Delegates.observable(false) { _, _, newValue ->
        if (newValue) hints[DecodeHintType.ALSO_INVERTED] = true
        else hints.remove(DecodeHintType.ALSO_INVERTED)
    }
    actual var isPure: Boolean by Delegates.observable(false) { _, _, newValue ->
        if (newValue) hints[DecodeHintType.PURE_BARCODE] = true
        else hints.remove(DecodeHintType.PURE_BARCODE)
    }
    actual var binarizer: Binarizer = GlobalHistogramBinarizer
    actual var formats: Set<BarcodeFormat> by Delegates.observable(BarcodeFormat.entries.toSet()) { _, _, newValue ->
        hints[DecodeHintType.POSSIBLE_FORMATS] = newValue.map { it.rawFormat }
    }

    // Here we're following https://github.com/zxing-cpp/zxing-cpp/issues/159
    actual var eanAddOnSymbol: EanAddOnSymbol by Delegates.observable(EanAddOnSymbol.Ignore) { _, _, newValue ->
        when (newValue) {
            // Ignore & Read: Handled by erasing ean add-on when requesting text in Barcode
            EanAddOnSymbol.Ignore -> hints.remove(DecodeHintType.ALLOWED_EAN_EXTENSIONS)
            EanAddOnSymbol.Read -> hints.remove(DecodeHintType.ALLOWED_EAN_EXTENSIONS)
            EanAddOnSymbol.Require -> hints[DecodeHintType.ALLOWED_EAN_EXTENSIONS] = arrayOf(2, 5)
        }
    }
    actual var maxNumberOfSymbols: Int = 1

    private var hints: MutableMap<DecodeHintType, Any?> = mutableMapOf()

    val asHints get() = hints.toMap()
}

actual enum class EanAddOnSymbol {
    Ignore, Read, Require,
}