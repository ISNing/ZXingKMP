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

import com.google.zxing.LuminanceSource
import com.google.zxing.NotFoundException
import com.google.zxing.common.BitArray
import com.google.zxing.common.BitMatrix
import com.google.zxing.Binarizer as RawBinarizer

actual interface Binarizer {
    /**
     * Converts one row of luminance data to 1 bit data. May actually do the conversion, or return
     * cached data. Callers should assume this method is expensive and call it as seldom as possible.
     * This method is intended for decoding 1D barcodes and may choose to apply sharpening.
     * For callers which only examine one row of pixels at a time, the same BitArray should be reused
     * and passed in with each call for performance. However it is legal to keep more than one row
     * at a time if needed.
     *
     * @param source The LuminanceSource this Binarizer will operate on.
     * @param y The row to fetch, which must be in [0, bitmap height)
     * @param row An optional preallocated array. If null or too small, it will be ignored.
     * If used, the Binarizer will call BitArray.clear(). Always use the returned object.
     * @return The array of bits for this row (true means black).
     * @throws NotFoundException if row can't be binarized
     */
    @Throws(NotFoundException::class)
    fun getBlackRow(source: LuminanceSource, y: Int, row: BitArray?): BitArray

    /**
     * Converts a 2D array of luminance data to 1 bit data. As above, assume this method is expensive
     * and do not call it repeatedly. This method is intended for decoding 2D barcodes and may or
     * may not apply sharpening. Therefore, a row from this matrix may not be identical to one
     * fetched using getBlackRow(), so don't mix and match between them.
     *
     * @param source The LuminanceSource this Binarizer will operate on.
     * @return The 2D array of bits for the image (true means black).
     * @throws NotFoundException if image can't be binarized to make a matrix
     */
    @Throws(NotFoundException::class)
    fun getBlackMatrix(source: LuminanceSource): BitMatrix

    /**
     * Creates a new object with the same type as this Binarizer implementation, but with pristine
     * state. This is needed because Binarizer implementations may be stateful, e.g. keeping a cache
     * of 1 bit data. See Effective Java for why we can't use Java's clone() method.
     *
     * @return A new concrete Binarizer implementation object.
     */
    fun createBinarizer(): Binarizer
}

class DelegatedZXingBinarizer(val delegated: Binarizer, source: LuminanceSource) : RawBinarizer(source) {
    override fun getBlackRow(y: Int, row: BitArray?): BitArray = delegated.getBlackRow(luminanceSource, y, row)

    override fun getBlackMatrix(): BitMatrix = delegated.getBlackMatrix(luminanceSource)

    override fun createBinarizer(source: LuminanceSource): RawBinarizer =
        DelegatedZXingBinarizer(delegated.createBinarizer(), source)

}

sealed class WrappedRawBinarizer(val factory: (LuminanceSource) -> RawBinarizer) : Binarizer {
    override fun getBlackRow(source: LuminanceSource, y: Int, row: BitArray?): BitArray =
        error("Do not use this, this is just for storing raw binarizer factory")

    override fun getBlackMatrix(source: LuminanceSource): BitMatrix =
        error("Do not use this, this is just for storing raw binarizer factory")

    override fun createBinarizer(): Binarizer =
        error("Do not use this, this is just for storing raw binarizer factory")
}

actual object GlobalHistogramBinarizer :
    WrappedRawBinarizer({ source -> com.google.zxing.common.GlobalHistogramBinarizer(source) }), Binarizer

actual object HybridBinarizer : WrappedRawBinarizer({ source -> com.google.zxing.common.HybridBinarizer(source) }),
    Binarizer

fun Binarizer.toZXingBinarizer(source: LuminanceSource): RawBinarizer = when (this) {
    is WrappedRawBinarizer -> factory(source)
    else -> DelegatedZXingBinarizer(this, source)
}