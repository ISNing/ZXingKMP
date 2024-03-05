package cn.isning.zxingkmp

import zxingcpp.TextMode
import zxingcpp.BarcodeReader as RawBarcodeReader
import zxingcpp.EanAddOnSymbol as RawEanAddOnSymbol
import zxingcpp.ReaderOptions as RawReaderOptions

actual class BarcodeReader actual constructor(options: ReaderOptions) {
    val raw: RawBarcodeReader = RawBarcodeReader()

    @Throws(BarcodeReadingException::class)
    actual fun read(imageView: ImageView): List<Barcode> =
        raw.read(imageView.raw).map { it.toWrapped() }
}

actual class ReaderOptions {
    val raw: RawReaderOptions = RawReaderOptions()

    actual var tryHarder: Boolean
        get() = raw.tryHarder
        set(value) {
            raw.tryHarder = value
        }
    var tryRotate: Boolean
        get() = raw.tryRotate
        set(value) {
            raw.tryRotate = value
        }
    var tryDownscale: Boolean
        get() = raw.tryDownscale
        set(value) {
            raw.tryDownscale = value
        }
    actual var tryInvert: Boolean
        get() = raw.tryInvert
        set(value) {
            raw.tryInvert = value
        }
    actual var isPure: Boolean
        get() = raw.isPure
        set(value) {
            raw.isPure = value
        }
    var returnErrors: Boolean
        get() = raw.returnErrors
        set(value) {
            raw.returnErrors = value
        }
    actual var binarizer: Binarizer
        get() = raw.binarizer.toWrapped()
        set(value) {
            raw.binarizer = value.raw
        }
    actual var formats: Set<BarcodeFormat>
        get() = raw.formats.toWrapped()
        set(value) {
            raw.formats = value.raw
        }
    actual var eanAddOnSymbol: EanAddOnSymbol
        get() = raw.eanAddOnSymbol.toWrapped()
        set(value) {
            raw.eanAddOnSymbol = value.raw
        }
    var textMode: TextMode
        get() = raw.textMode
        set(value) {
            raw.textMode = value
        }
    var minLineCount: Int
        get() = raw.minLineCount
        set(value) {
            raw.minLineCount = value
        }
    actual var maxNumberOfSymbols: Int
        get() = raw.maxNumberOfSymbols
        set(value) {
            raw.maxNumberOfSymbols = value
        }
}

actual enum class EanAddOnSymbol(val raw: RawEanAddOnSymbol) {
    Ignore(RawEanAddOnSymbol.Ignore),
    Read(RawEanAddOnSymbol.Read),
    Require(RawEanAddOnSymbol.Require),
}

fun RawEanAddOnSymbol.toWrapped(): EanAddOnSymbol = EanAddOnSymbol.entries.first { it.raw == this }
