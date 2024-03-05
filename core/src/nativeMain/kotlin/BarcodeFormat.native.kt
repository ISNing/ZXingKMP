package cn.isning.zxingkmp

import zxingcpp.BarcodeFormat as RawBarcodeFormat

actual enum class BarcodeFormat(val raw: RawBarcodeFormat) {
    Aztec(RawBarcodeFormat.Aztec),
    Codabar(RawBarcodeFormat.Codabar),
    Code39(RawBarcodeFormat.Code39),
    Code93(RawBarcodeFormat.Code93),
    Code128(RawBarcodeFormat.Code128),
    DataBar(RawBarcodeFormat.DataBar),
    DataBarExpanded(RawBarcodeFormat.DataBarExpanded),
    DataMatrix(RawBarcodeFormat.DataMatrix),
    DXFilmEdge(RawBarcodeFormat.DXFilmEdge),
    EAN8(RawBarcodeFormat.EAN8),
    EAN13(RawBarcodeFormat.EAN13),
    ITF(RawBarcodeFormat.ITF),
    MaxiCode(RawBarcodeFormat.MaxiCode),
    PDF417(RawBarcodeFormat.PDF417),
    QRCode(RawBarcodeFormat.QRCode),
    MicroQrCode(RawBarcodeFormat.MicroQrCode),
    RMQRCode(RawBarcodeFormat.RMQRCode),
    UPCA(RawBarcodeFormat.UPCA),
    UPCE(RawBarcodeFormat.UPCE),
}

fun Iterable<RawBarcodeFormat>.toWrapped(): Set<BarcodeFormat> = map { it.toWrapped() }.toSet()

fun RawBarcodeFormat.toWrapped(): BarcodeFormat = BarcodeFormat.entries.first { it.raw == this }

val Set<BarcodeFormat>.raw get() = map { it.raw }.toSet()
