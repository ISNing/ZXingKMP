package cn.isning.zxingkmp

import zxingcpp.ImageFormat as RawImageFormat
import zxingcpp.ImageView as RawImageView

val ImageView.raw get() = RawImageView(data, width, height, format.raw, rowStride, pixStride)

actual enum class ImageFormat(val raw: RawImageFormat) {
    Lum(RawImageFormat.Lum),
    RGB(RawImageFormat.RGB),
    BGR(RawImageFormat.BGR),
    RGBA(RawImageFormat.RGBA),
    ARGB(RawImageFormat.ARGB),
    BGRA(RawImageFormat.BGRA),
    ABGR(RawImageFormat.ABGR),
}