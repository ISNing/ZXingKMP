package cn.isning.zxingkmp

import cn.isning.zxingkmp.jsinterop.zxing.library.BarcodeFormat as RawBarcodeFormat

actual enum class BarcodeFormat(val raw: RawBarcodeFormat) {
    Aztec(RawBarcodeFormat.AZTEC),
    Codabar(RawBarcodeFormat.CODABAR),
    Code39(RawBarcodeFormat.CODE_39),
    Code93(RawBarcodeFormat.CODE_93),
    Code128(RawBarcodeFormat.CODE_128),
    DataBar(RawBarcodeFormat.RSS_14),
    DataBarExpanded(RawBarcodeFormat.RSS_EXPANDED),
    DataMatrix(RawBarcodeFormat.DATA_MATRIX),
    EAN8(RawBarcodeFormat.EAN_8),
    EAN13(RawBarcodeFormat.EAN_13),
    ITF(RawBarcodeFormat.ITF),
    MaxiCode(RawBarcodeFormat.MAXICODE),
    PDF417(RawBarcodeFormat.PDF_417),
    QRCode(RawBarcodeFormat.QR_CODE),
    UPCA(RawBarcodeFormat.UPC_A),
    UPCE(RawBarcodeFormat.UPC_E),
}

fun RawBarcodeFormat.toWrapped(): BarcodeFormat = BarcodeFormat.entries.toTypedArray().first { it.raw == this }
