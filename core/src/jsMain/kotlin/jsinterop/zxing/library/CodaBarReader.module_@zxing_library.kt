@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("CodaBarReader")
open external class CodaBarReader : OneDReader {
    open var CODA_BAR_CHAR_SET: Any
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    open var getValidRowData: Any
    open var codaBarDecodeRow: Any
    open var validCodaBarString: Any
}