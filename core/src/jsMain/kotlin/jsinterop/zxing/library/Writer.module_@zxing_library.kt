@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external interface Writer {
    fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Number,
        height: Number,
        hints: Map<EncodeHintType, Any>
    ): BitMatrix
}