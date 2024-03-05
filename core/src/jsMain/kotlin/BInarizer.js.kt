package cn.isning.zxingkmp

import cn.isning.zxingkmp.jsinterop.zxing.library.BitArray
import cn.isning.zxingkmp.jsinterop.zxing.library.BitMatrix
import cn.isning.zxingkmp.jsinterop.zxing.library.LuminanceSource
import cn.isning.zxingkmp.jsinterop.zxing.library.NotFoundException
import cn.isning.zxingkmp.jsinterop.zxing.library.Binarizer as ZXingBinarizer

actual interface Binarizer {
    /**
     * Converts one row of luminance data to 1 bit data. May actually do the conversion, or return
     * cached data. Callers should assume this method is expensive and call it as seldom as possible.
     * This method is intended for decoding 1D barcodes and may choose to apply sharpening.
     * For callers which only examine one row of pixels at a time, the same BitArray should be reused
     * and passed in with each call for performance. However it is legal to keep more than one row
     * at a time if needed.
     *
     * @param y The row to fetch, which must be in [0, bitmap height)
     * @param row An optional preallocated array. If null or too small, it will be ignored.
     * If used, the Binarizer will call BitArray.clear(). Always use the returned object.
     * @return The array of bits for this row (true means black).
     * @throws NotFoundException if row can't be binarized
     */
    fun getBlackRow(source: LuminanceSource, y: Number, row: BitArray?): BitArray

    /**
     * Converts a 2D array of luminance data to 1 bit data. As above, assume this method is expensive
     * and do not call it repeatedly. This method is intended for decoding 2D barcodes and may or
     * may not apply sharpening. Therefore, a row from this matrix may not be identical to one
     * fetched using getBlackRow(), so don't mix and match between them.
     *
     * @return The 2D array of bits for the image (true means black).
     * @throws NotFoundException if image can't be binarized to make a matrix
     */
    fun getBlackMatrix(source: LuminanceSource): BitMatrix

    /**
     * Creates a new object with the same type as this Binarizer implementation, but with pristine
     * state. This is needed because Binarizer implementations may be stateful, e.g. keeping a cache
     * of 1 bit data. See Effective Java for why we can't use Java's clone() method.
     *
     * @param source The LuminanceSource this Binarizer will operate on.
     * @return A new concrete Binarizer implementation object.
     */
    fun createBinarizer(): Binarizer
}

private class DelegatedZXingBinarizer(private val delegated: Binarizer, source: LuminanceSource) :
    ZXingBinarizer(source) {
    override fun getBlackRow(y: Number, row: BitArray): BitArray = delegated.getBlackRow(getLuminanceSource(), y, row)

    override fun getBlackMatrix(): BitMatrix = delegated.getBlackMatrix(getLuminanceSource())

    override fun createBinarizer(source: LuminanceSource): ZXingBinarizer =
        DelegatedZXingBinarizer(delegated.createBinarizer(), source)

}

sealed class WrappedRawBinarizer(val factory: (LuminanceSource) -> ZXingBinarizer) : Binarizer {
    override fun getBlackRow(source: LuminanceSource, y: Number, row: BitArray?): BitArray =
        error("Do not use this, this is just for storing raw binarizer factory")

    override fun getBlackMatrix(source: LuminanceSource): BitMatrix =
        error("Do not use this, this is just for storing raw binarizer factory")

    override fun createBinarizer(): Binarizer =
        error("Do not use this, this is just for storing raw binarizer factory")
}

actual object GlobalHistogramBinarizer :
    WrappedRawBinarizer({ source -> cn.isning.zxingkmp.jsinterop.zxing.library.GlobalHistogramBinarizer(source) }),
    Binarizer

actual object HybridBinarizer :
    WrappedRawBinarizer({ source -> cn.isning.zxingkmp.jsinterop.zxing.library.HybridBinarizer(source) }), Binarizer

fun Binarizer.toZXingBinarizer(source: LuminanceSource): ZXingBinarizer = when (this) {
    is WrappedRawBinarizer -> factory(source)
    else -> DelegatedZXingBinarizer(this, source)
}