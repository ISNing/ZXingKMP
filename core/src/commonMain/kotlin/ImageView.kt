/*
* Copyright 2024 ISNing
*/
// SPDX-License-Identifier: Apache-2.0

package cn.isning.zxingkmp

class ImageView(
    val data: ByteArray,
    val width: Int,
    val height: Int,
    val format: ImageFormat,
    val rowStride: Int = 0,
    val pixStride: Int = 0,
)

expect enum class ImageFormat {
    Lum,
    RGB,
    BGR,
    RGBA,
    ARGB,
    BGRA,
    ABGR
}
