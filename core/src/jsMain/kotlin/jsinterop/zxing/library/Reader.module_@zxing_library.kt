@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import kotlin.js.collections.JsReadonlyMap

external interface Reader {
    @OptIn(ExperimentalJsCollectionsApi::class)
    fun decode(image: BinaryBitmap, hints: JsReadonlyMap<DecodeHintType, Any?> = definedExternally): Result
    fun reset()
}