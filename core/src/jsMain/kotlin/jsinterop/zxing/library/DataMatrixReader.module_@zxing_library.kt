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

@JsName("DataMatrixReader")
open external class DataMatrixReader : Reader {
    open var decoder: Any
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decode(image: BinaryBitmap, hints: JsReadonlyMap<DecodeHintType, Any?>/* = definedExternally */): Result
    override fun reset()

    companion object {
        var NO_POINTS: Any
        var extractPureBits: Any
        var moduleSize: Any
    }
}