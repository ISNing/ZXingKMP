@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("Code128Reader")
open external class Code128Reader : OneDReader {
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    companion object {
        var CODE_PATTERNS: Any
        var MAX_AVG_VARIANCE: Any
        var MAX_INDIVIDUAL_VARIANCE: Any
        var CODE_SHIFT: Any
        var CODE_CODE_C: Any
        var CODE_CODE_B: Any
        var CODE_CODE_A: Any
        var CODE_FNC_1: Any
        var CODE_FNC_2: Any
        var CODE_FNC_3: Any
        var CODE_FNC_4_A: Any
        var CODE_FNC_4_B: Any
        var CODE_START_A: Any
        var CODE_START_B: Any
        var CODE_START_C: Any
        var CODE_STOP: Any
        var findStartPattern: Any
        var decodeCode: Any
    }
}