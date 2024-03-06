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

@JsName("default")
abstract external class AbstractRSSReader : OneDReader {
    open var decodeFinderCounters: Any
    open var dataCharacterCounters: Any
    open var oddRoundingErrors: Any
    open var evenRoundingErrors: Any
    open var oddCounts: Any
    open var evenCounts: Any
    open fun getDecodeFinderCounters(): Int32Array
    open fun getDataCharacterCounters(): Int32Array
    open fun getOddRoundingErrors(): Array<Number>
    open fun getEvenRoundingErrors(): Array<Number>
    open fun getOddCounts(): Array<Number>
    open fun getEvenCounts(): Array<Number>
    open fun parseFinderValue(counters: Int32Array, finderPatterns: Array<Int32Array>): Number

    companion object {
        var MAX_AVG_VARIANCE: Any
        var MAX_INDIVIDUAL_VARIANCE: Any
        var MIN_FINDER_PATTERN_RATIO: Any
        var MAX_FINDER_PATTERN_RATIO: Any
        fun count(array: Array<Number>): Number
        fun increment(array: Array<Number>, errors: Array<Number>)
        fun decrement(array: Array<Number>, errors: Array<Number>)
        fun isFinderPattern(counters: Int32Array): Boolean
    }
}