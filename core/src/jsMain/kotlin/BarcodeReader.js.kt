/*
 * Copyright 2024 ISNing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.isning.zxingkmp

import cn.isning.zxingkmp.jsinterop.zxing.library.DecodeHintType
import cn.isning.zxingkmp.jsinterop.zxing.library.MultiFormatReader
import cn.isning.zxingkmp.jsinterop.zxing.library.NotFoundException
import kotlin.properties.Delegates

@OptIn(ExperimentalJsExport::class, ExperimentalJsCollectionsApi::class)
actual class BarcodeReader actual constructor(private val options: ReaderOptions) {
    private val reader = MultiFormatReader().also { it.setHints(options.asHints.asJsReadonlyMapView()) }

    // TODO: Currently zxing only supports one barcode per image: https://github.com/ISNing/ZXingKMP/issues/7
    actual fun read(imageView: ImageView): List<Barcode> = try {
        reader.decodeWithState(imageView.toBinaryBitmap(options.binarizer)).let {
            listOf(it.toWrapped(options.eanAddOnSymbol))
        }
    } catch (e: NotFoundException) {
        e.printStackTrace()
        emptyList()
    } catch (e: Exception) {
        throw BarcodeReadingException(e.message ?: "Unknown error", e)
    }
}

actual class ReaderOptions actual constructor() {
    actual var tryHarder: Boolean by Delegates.observable(false) { _, _, newValue ->
        if (newValue) hints[DecodeHintType.TRY_HARDER] = true
        else hints.remove(DecodeHintType.TRY_HARDER)
    }
    @Deprecated("Not supported by upstream library yet. See: https://github.com/ISNing/ZXingKMP/issues/9", level = DeprecationLevel.WARNING)
    actual var tryInvert: Boolean
    actual var isPure: Boolean by Delegates.observable(false) { _, _, newValue ->
        if (newValue) hints[DecodeHintType.PURE_BARCODE] = true
        else hints.remove(DecodeHintType.PURE_BARCODE)
    }
    actual var binarizer: Binarizer
    @OptIn(ExperimentalJsExport::class, ExperimentalJsCollectionsApi::class)
    actual var formats: Set<BarcodeFormat> by Delegates.observable(emptySet()) { _, _, newValue ->
        hints[DecodeHintType.POSSIBLE_FORMATS] = newValue.map { it.raw }.asJsReadonlyArrayView()
    }

    // Here we're following https://github.com/zxing-cpp/zxing-cpp/issues/159
    @OptIn(ExperimentalJsExport::class, ExperimentalJsCollectionsApi::class)
    actual var eanAddOnSymbol: EanAddOnSymbol by Delegates.observable(EanAddOnSymbol.Ignore) { _, _, newValue ->
        when (newValue) {
            // Ignore & Read: Handled by erasing ean add-on when requesting text in Barcode
            EanAddOnSymbol.Ignore -> hints.remove(DecodeHintType.ALLOWED_EAN_EXTENSIONS)
            EanAddOnSymbol.Read -> hints.remove(DecodeHintType.ALLOWED_EAN_EXTENSIONS)
            EanAddOnSymbol.Require -> hints[DecodeHintType.ALLOWED_EAN_EXTENSIONS] = listOf(2, 5).asJsReadonlyArrayView()
        }
    }
    actual var maxNumberOfSymbols: Int

    private val hints: MutableMap<DecodeHintType, Any?> = mutableMapOf()

    val asHints get() = hints.toMap()

    init {
        tryHarder = false
        @Suppress("DEPRECATION")
        tryInvert = false
        isPure = false
        binarizer = GlobalHistogramBinarizer
        formats = BarcodeFormat.entries.toSet()
        eanAddOnSymbol = EanAddOnSymbol.Read
        maxNumberOfSymbols = 1
    }
}

actual enum class EanAddOnSymbol {
    Ignore, Read, Require,
}