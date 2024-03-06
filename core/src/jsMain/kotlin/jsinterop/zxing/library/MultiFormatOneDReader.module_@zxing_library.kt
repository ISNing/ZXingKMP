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

@OptIn(ExperimentalJsCollectionsApi::class)
@JsName("MultiFormatOneDReader")
open external class MultiFormatOneDReader(hints: JsReadonlyMap<DecodeHintType, Any> = definedExternally) :
    OneDReader {
    open var readers: Any
    override fun decodeRow(rowNumber: Number, row: BitArray, hints: JsReadonlyMap<DecodeHintType, Any>): Result
    override fun reset()
}