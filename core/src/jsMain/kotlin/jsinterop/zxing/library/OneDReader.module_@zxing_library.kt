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
open external class OneDReader : Reader {
    override fun decode(image: BinaryBitmap, hints: Map<DecodeHintType, Any>?/* = definedExternally */): Result
    override fun reset()
    open var doDecode: Any
    open fun decodeRow(rowNumber: Number, row: BitArray, hints: Map<DecodeHintType, Any> = definedExternally): Result

    companion object {
        fun recordPattern(row: BitArray, start: Number, counters: Int32Array)
        fun recordPatternInReverse(row: BitArray, start: Number, counters: Int32Array)
        fun patternMatchVariance(counters: Int32Array, pattern: Int32Array, maxIndividualVariance: Number): Number
    }
}