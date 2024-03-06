@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import kotlin.js.collections.JsReadonlyMap

@JsName("AztecReader")
open external class AztecReader : Reader {
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decode(image: BinaryBitmap, hints: JsReadonlyMap<DecodeHintType, Any?>/* = definedExternally */): Result
    open var reportFoundResultPoints: Any
    override fun reset()
}