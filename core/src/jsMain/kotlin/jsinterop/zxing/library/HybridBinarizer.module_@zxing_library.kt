@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("HybridBinarizer")
open external class HybridBinarizer(source: LuminanceSource) :
    GlobalHistogramBinarizer {
    open var matrix: Any
    override fun getBlackMatrix(): BitMatrix
    override fun createBinarizer(source: LuminanceSource): Binarizer

    companion object {
        var BLOCK_SIZE_POWER: Any
        var BLOCK_SIZE: Any
        var BLOCK_SIZE_MASK: Any
        var MINIMUM_DIMENSION: Any
        var MIN_DYNAMIC_RANGE: Any
        var calculateThresholdForBlock: Any
        var cap: Any
        var thresholdBlock: Any
        var calculateBlackPoints: Any
    }
}