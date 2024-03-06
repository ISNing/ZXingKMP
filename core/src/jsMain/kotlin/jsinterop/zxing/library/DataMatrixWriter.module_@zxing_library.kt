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

@JsName("DataMatrixWriter")
open external class DataMatrixWriter : Writer {
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Number,
        height: Number,
        hints: JsReadonlyMap<EncodeHintType, Any>/* = definedExternally */
    ): BitMatrix

    open var encodeLowLevel: Any
    open var convertByteMatrixToBitMatrix: Any
}