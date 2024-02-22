@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("default")
open external class MultiFormatReader : Reader {
    open var hints: Any
    open var readers: Any
    override fun decode(image: BinaryBitmap, hints: Map<DecodeHintType, Any>?/* = definedExternally */): Result
    open fun decodeWithState(image: BinaryBitmap): Result
    open fun setHints(hints: Map<DecodeHintType, Any>? = definedExternally)
    override fun reset()
    open var decodeInternal: Any
}