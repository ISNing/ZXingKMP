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
open external class AztecReader : Reader {
    override fun decode(image: BinaryBitmap, hints: Map<DecodeHintType, Any>?/* = definedExternally */): Result
    open var reportFoundResultPoints: Any
    override fun reset()
}