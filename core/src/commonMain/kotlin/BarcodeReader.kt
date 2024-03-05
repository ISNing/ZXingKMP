/*
* Copyright 2024 ISNing
*/
// SPDX-License-Identifier: Apache-2.0

package cn.isning.zxingkmp

expect class BarcodeReader(options: ReaderOptions) {
    @Throws(BarcodeReadingException::class)
    fun read(imageView: ImageView): List<Barcode>
}

class BarcodeReadingException(message: String?) : Exception("Failed to read barcodes: $message")


expect class ReaderOptions {
    var tryHarder: Boolean
    var tryInvert: Boolean
    var isPure: Boolean
    var binarizer: Binarizer
    var formats: Set<BarcodeFormat>
    var eanAddOnSymbol: EanAddOnSymbol
    var maxNumberOfSymbols: Int
}

expect enum class EanAddOnSymbol {
    Ignore,
    Read,
    Require,
}
