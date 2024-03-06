@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("ITFReader")
open external class ITFReader : OneDReader {
    open var narrowLineWidth: Any
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    open var decodeStart: Any
    open var validateQuietZone: Any
    open var decodeEnd: Any

    companion object {
        var PATTERNS: Any
        var MAX_AVG_VARIANCE: Any
        var MAX_INDIVIDUAL_VARIANCE: Any
        var DEFAULT_ALLOWED_LENGTHS: Any
        var START_PATTERN: Any
        var END_PATTERN_REVERSED: Any
        var decodeMiddle: Any
        var skipWhiteSpace: Any
        var findGuardPattern: Any
        var decodeDigit: Any
    }
}