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

@JsName("MultiFormatReader")
open external class MultiFormatReader : Reader {
    open var hints: Any
    open var readers: Any
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decode(image: BinaryBitmap, hints: JsReadonlyMap<DecodeHintType, Any?>/* = definedExternally */): Result
    open fun decodeWithState(image: BinaryBitmap): Result
    @OptIn(ExperimentalJsCollectionsApi::class)
    open fun setHints(hints: JsReadonlyMap<DecodeHintType, Any?> = definedExternally)
    override fun reset()
    open var decodeInternal: Any
}