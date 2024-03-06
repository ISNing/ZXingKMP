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

@JsName("CodaBarReader")
open external class CodaBarReader : OneDReader {
    open var CODA_BAR_CHAR_SET: Any
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: JsReadonlyMap<DecodeHintType, Any>/* = definedExternally */
    ): Result

    open var getValidRowData: Any
    open var codaBarDecodeRow: Any
    open var validCodaBarString: Any
}