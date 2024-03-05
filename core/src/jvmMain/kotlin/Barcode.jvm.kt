package cn.isning.zxingkmp

import com.google.zxing.Result
import com.google.zxing.ResultMetadataType
import com.google.zxing.ResultPoint

actual class Barcode(private val raw: Result, private val eanAddOnSymbol: EanAddOnSymbol) {
    actual val isValid: Boolean = true
    actual val format: BarcodeFormat
        get() = raw.barcodeFormat.toWrapped()
    actual val bytes: ByteArray?
        get() = raw.rawBytes
    actual val text: String?
        get() = when (eanAddOnSymbol) {
            EanAddOnSymbol.Ignore -> raw.text
            EanAddOnSymbol.Read, EanAddOnSymbol.Require -> raw.resultMetadata[ResultMetadataType.UPC_EAN_EXTENSION]
                ?.toString()?.let { "${raw.text}+$it" } ?: raw.text
        }
    actual val ecLevel: String?
        get() = raw.resultMetadata[ResultMetadataType.ERROR_CORRECTION_LEVEL]?.toString()
    actual val symbologyIdentifier: String?
        get() = raw.resultMetadata[ResultMetadataType.SYMBOLOGY_IDENTIFIER]?.toString()
    actual val position: Position
        get() = raw.resultPoints.toWrapped()
    actual val orientation: Int
        get() = raw.resultMetadata[ResultMetadataType.ORIENTATION] as Int
}

fun Result.toWrapped(eanAddOnSymbol: EanAddOnSymbol): Barcode = Barcode(this, eanAddOnSymbol)

fun ResultPoint.toWrapped(): Point = Point(x, y)

fun Array<ResultPoint>.toWrapped(): Position =
    Position(this[0].toWrapped(), this[1].toWrapped(), this[2].toWrapped(), this[3].toWrapped())
