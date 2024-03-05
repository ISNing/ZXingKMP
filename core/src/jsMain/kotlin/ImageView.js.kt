/*/*
* Copyright 2024 ISNing
*/
// SPDX-License-Identifier: Apache-2.0
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

import cn.isning.zxingkmp.ImageFormat.*
import cn.isning.zxingkmp.jsinterop.zxing.library.BinaryBitmap
import cn.isning.zxingkmp.jsinterop.zxing.library.LuminanceSource
import cn.isning.zxingkmp.jsinterop.zxing.library.System
import org.khronos.webgl.Uint8ClampedArray
import org.khronos.webgl.set

fun ImageView.toBinaryBitmap(binarizer: Binarizer): BinaryBitmap =
    BinaryBitmap(binarizer.toZXingBinarizer(LuminanceSourceImpl(width, height, data, format)))

/*
 * Copyright 2009 ZXing authors
 * Copyright 2024 ISNing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class LuminanceSourceImpl : LuminanceSource {
    private val luminances: Uint8ClampedArray
    private val dataWidth: Int
    private val dataHeight: Int
    private val left: Int
    private val top: Int

    constructor(width: Int, height: Int, pixels: IntArray, format: ImageFormat) : super(width, height) {
        dataWidth = width
        dataHeight = height
        left = 0
        top = 0

        // In order to measure pure decoding speed, we convert the entire image to a greyscale array
        // up front, which is the same as the Y channel of the YUVLuminanceSource in the real app.
        //
        // Total number of pixels suffices, can ignore shape
        val size = width * height
        luminances = Uint8ClampedArray(size)
        // Calculate green-favouring average cheaply
        val lumGen: (Int) -> Byte =
            when (format) {
                RGB -> { pixel ->
                    val r = (pixel shr 16) and 0xff // red
                    val g2 = (pixel shr 7) and 0x1fe // 2 * green
                    val b = pixel and 0xff // blue
                    ((r + g2 + b) / 4).toByte()
                }

                BGR -> { pixel ->
                    val r = pixel and 0xff // blue
                    val g2 = (pixel shr 7) and 0x1fe // 2 * green
                    val b = (pixel shr 16) and 0xff // red
                    ((r + g2 + b) / 4).toByte()
                }

                RGBA -> { pixel ->
                    val r = (pixel shr 24) and 0xff // red
                    val g2 = (pixel shr 15) and 0x1fe // 2 * green
                    val b = (pixel shr 8) and 0xff // blue
                    ((r + g2 + b) / 4).toByte()
                }

                ARGB -> { pixel ->
                    val r = (pixel shr 16) and 0xff // red
                    val g2 = (pixel shr 7) and 0x1fe // 2 * green
                    val b = pixel and 0xff // blue
                    ((r + g2 + b) / 4).toByte()
                }

                BGRA -> { pixel ->
                    val r = (pixel shr 8) and 0xff // red
                    val g2 = (pixel shr 15) and 0x1fe // 2 * green
                    val b = (pixel shr 24) and 0xff // blue
                    ((r + g2 + b) / 4).toByte()
                }

                ABGR -> { pixel ->
                    val r = pixel and 0xff // red
                    val g2 = (pixel shr 7) and 0x1fe // 2 * green
                    val b = (pixel shr 16) and 0xff // blue
                    ((r + g2 + b) / 4).toByte()
                }

                else -> error("Unsupported ImageFormat")
            }

        for (offset in 0 until size) {
            luminances[offset] = lumGen(pixels[offset])
        }
    }

    constructor(width: Int, height: Int, pixels: ByteArray, format: ImageFormat) : super(width, height) {
        dataWidth = width
        dataHeight = height
        left = 0
        top = 0

        // In order to measure pure decoding speed, we convert the entire image to a greyscale array
        // up front, which is the same as the Y channel of the YUVLuminanceSource in the real app.
        //
        // Total number of pixels suffices, can ignore shape
        val size = width * height
        if (format == Lum) {
            luminances = Uint8ClampedArray(pixels.toTypedArray())
            return
        }
        luminances = Uint8ClampedArray(size)
        val step = when (format) {
            RGB, BGR -> 3
            RGBA, ARGB, BGRA, ABGR -> 4
            else -> error("Unsupported ImageFormat")
        }
        // Calculate green-favouring average cheaply
        val lumGen: (Int) -> Byte =
            when (format) {
                RGB -> { offset ->
                    val r = pixels[offset].toInt() // red
                    val g2 = pixels[offset + 1].toInt() shl 1 // 2 * green
                    val b = pixels[offset + 2].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                BGR -> { offset ->
                    val r = pixels[offset + 2].toInt() // red
                    val g2 = pixels[offset + 1].toInt() shl 1 // 2 * green
                    val b = pixels[offset].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                RGBA -> { offset ->
                    val r = pixels[offset].toInt() // red
                    val g2 = pixels[offset + 1].toInt() shl 1 // 2 * green
                    val b = pixels[offset + 2].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                ARGB -> { offset ->
                    val r = pixels[offset + 1].toInt() // red
                    val g2 = pixels[offset + 2].toInt() shl 1 // 2 * green
                    val b = pixels[offset + 3].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                BGRA -> { offset ->
                    val r = pixels[offset + 2].toInt() // red
                    val g2 = pixels[offset + 1].toInt() shl 1 // 2 * green
                    val b = pixels[offset].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                ABGR -> { offset ->
                    val r = pixels[offset + 3].toInt() // red
                    val g2 = pixels[offset + 2].toInt() shl 1 // 2 * green
                    val b = pixels[offset + 1].toInt() // blue
                    ((r + g2 + b) / 4).toByte()
                }

                else -> error("Unsupported ImageFormat")
            }

        for (pixel in 0 until size) {
            luminances[pixel] = lumGen(pixel * step)
        }
    }

    private constructor(
        pixels: Uint8ClampedArray,
        dataWidth: Int,
        dataHeight: Int,
        left: Int,
        top: Int,
        width: Int,
        height: Int
    ) : super(width, height) {
        require(!(left + width > dataWidth || top + height > dataHeight)) { "Crop rectangle does not fit within image data." }
        this.luminances = pixels
        this.dataWidth = dataWidth
        this.dataHeight = dataHeight
        this.left = left
        this.top = top
    }

    override fun getRow(y: Number, row: Uint8ClampedArray?): Uint8ClampedArray {
        var res: Uint8ClampedArray = row ?: Uint8ClampedArray(width.toInt())
        require(!(y.toInt() < 0 || y.toInt() >= height.toInt())) { "Requested row is outside the image: $y" }
        val width = width
        if (res == null || res.length < width.toInt()) {
            res = Uint8ClampedArray(width.toInt())
        }
        val offset = (y.toInt() + top) * dataWidth + left
        System.arraycopy(luminances, offset, res, 0, width)
        return res
    }

    override fun getMatrix(): Uint8ClampedArray {
        val width = width.toInt()
        val height = height.toInt()

        // If the caller asks for the entire underlying image, save the copy and give them the
        // original data. The docs specifically warn that result.length must be ignored.
        if (width == dataWidth && height == dataHeight) {
            return luminances
        }

        val area = width * height
        val matrix = Uint8ClampedArray(area)
        var inputOffset = top * dataWidth + left

        // If the width matches the full width of the underlying data, perform a single copy.
        if (width == dataWidth) {
            System.arraycopy(luminances, inputOffset, matrix, 0, area)
            return matrix
        }

        // Otherwise copy one cropped row at a time.
        for (y in 0 until height) {
            val outputOffset = y * width
            System.arraycopy(luminances, inputOffset, matrix, outputOffset, width)
            inputOffset += dataWidth
        }
        return matrix
    }

    override fun isCropSupported(): Boolean {
        return true
    }

    override fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource {
        return LuminanceSourceImpl(
            luminances,
            dataWidth,
            dataHeight,
            this.left + left.toInt(),
            this.top + top.toInt(),
            width.toInt(),
            height.toInt()
        )
    }
}

actual enum class ImageFormat {
    Lum, RGB, BGR, RGBA, ARGB, BGRA, ABGR
}