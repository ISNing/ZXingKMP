package cn.isning.zxingkmp

import cn.isning.zxingkmp.jsinterop.zxing.library.Result
import cn.isning.zxingkmp.jsinterop.zxing.library.ResultMetadataType
import cn.isning.zxingkmp.jsinterop.zxing.library.ResultPoint
import org.khronos.webgl.get

actual class Barcode(private val raw: Result, private val eanAddOnSymbol: EanAddOnSymbol) {
    actual val isValid: Boolean = true
    actual val format: BarcodeFormat
        get() = raw.getBarcodeFormat().toWrapped()
    actual val bytes: ByteArray?
        get() = raw.getRawBytes().let { ByteArray(it.length) { i -> it[i] } }
    actual val text: String?
        get() = when (eanAddOnSymbol) {
            EanAddOnSymbol.Ignore -> raw.getText()
            EanAddOnSymbol.Read, EanAddOnSymbol.Require -> (raw.getResultMetadata()[ResultMetadataType.UPC_EAN_EXTENSION]
                    as? String)?.let { "${raw.getText()}+$it" } ?: raw.getText()
        }
    actual val ecLevel: String?
        get() = raw.getResultMetadata()[ResultMetadataType.ERROR_CORRECTION_LEVEL]?.toString()
    actual val symbologyIdentifier: String?
        get() = TODO("This is not supported by upstream library yet. See: https://github.com/ISNing/ZXingKMP/issues/6")
    actual val position: Position
        get() = raw.getResultPoints().toWrapped()
    actual val orientation: Int
        get() = raw.getResultMetadata()[ResultMetadataType.ORIENTATION] as Int
}

fun Result.toWrapped(eanAddOnSymbol: EanAddOnSymbol): Barcode = Barcode(this, eanAddOnSymbol)

fun ResultPoint.toWrapped(): Point = Point(getX(), getY())

fun Array<ResultPoint>.toWrapped(): Position =
    Position(this[0].toWrapped(), this[1].toWrapped(), this[2].toWrapped(), this[3].toWrapped())
