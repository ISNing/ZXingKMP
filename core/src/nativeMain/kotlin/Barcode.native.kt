package cn.isning.zxingkmp

import zxingcpp.ContentType
import zxingcpp.Barcode as RawBarcode
import zxingcpp.PointI as RawPoint
import zxingcpp.Position as RawPosition

actual class Barcode(private val raw: RawBarcode) {
    actual val isValid: Boolean
        get() = raw.isValid
    val errorMsg: String?
        get() = raw.errorMsg
    actual val format: BarcodeFormat by lazy { raw.format.toWrapped() }
    val contentType: ContentType
        get() = raw.contentType
    actual val bytes: ByteArray?
        get() = raw.bytes
    val bytesECI: ByteArray?
        get() = raw.bytesECI
    actual val text: String?
        get() = raw.text
    actual val ecLevel: String?
        get() = raw.ecLevel
    actual val symbologyIdentifier: String?
        get() = raw.symbologyIdentifier
    actual val position: Position by lazy { raw.position.toWrapped() }
    actual val orientation: Int
        get() = raw.orientation
    val hasECI: Boolean
        get() = raw.hasECI
    val isInverted: Boolean
        get() = raw.isInverted
    val isMirrored: Boolean
        get() = raw.isMirrored
    val lineCount: Int
        get() = raw.lineCount

}

fun RawBarcode.toWrapped(): Barcode {
    return Barcode(this)
}

fun RawPosition.toWrapped(): Position {
    return Position(
        topLeft.toWrapped(),
        topRight.toWrapped(),
        bottomRight.toWrapped(),
        bottomLeft.toWrapped()
    )
}

fun RawPoint.toWrapped(): Point {
    return Point(x, y)
}