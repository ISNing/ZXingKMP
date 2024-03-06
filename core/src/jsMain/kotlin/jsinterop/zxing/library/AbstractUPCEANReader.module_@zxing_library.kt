@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Int32Array
import kotlin.js.collections.JsReadonlyMap

@JsName("default")
abstract external class AbstractUPCEANReader : OneDReader {
    open var decodeRowStringBuffer: String
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: JsReadonlyMap<DecodeHintType, Any>/* = definedExternally */
    ): Result

    open fun getBarcodeFormat(): Any
    open fun decodeMiddle(row: BitArray, startRange: Int32Array, resultString: String): Any

    companion object {
        var MAX_AVG_VARIANCE: Any
        var MAX_INDIVIDUAL_VARIANCE: Any
        var START_END_PATTERN: Int32Array
        var MIDDLE_PATTERN: Int32Array
        var END_PATTERN: Int32Array
        var L_PATTERNS: Array<Int32Array>
        var L_AND_G_PATTERNS: Array<Int32Array>
        fun findStartGuardPattern(row: BitArray): Int32Array
        fun checkChecksum(s: String): Boolean
        fun checkStandardUPCEANChecksum(s: String): Boolean
        fun getStandardUPCEANChecksum(s: String): Number
        fun decodeEnd(row: BitArray, endStart: Number): Int32Array
        fun findGuardPatternWithoutCounters(
            row: BitArray,
            rowOffset: int,
            whiteFirst: Boolean,
            pattern: Int32Array
        ): Int32Array

        fun findGuardPattern(
            row: BitArray,
            rowOffset: Number,
            whiteFirst: Boolean,
            pattern: Int32Array,
            counters: Int32Array
        ): Int32Array

        fun decodeDigit(row: BitArray, counters: Int32Array, rowOffset: int, patterns: Array<Int32Array>): Number
    }
}