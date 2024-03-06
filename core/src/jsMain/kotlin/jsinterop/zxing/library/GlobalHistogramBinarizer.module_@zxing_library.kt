@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("GlobalHistogramBinarizer")
open external class GlobalHistogramBinarizer(source: LuminanceSource) :
    Binarizer {
    open var luminances: Any
    open var buckets: Any
    override fun getBlackRow(y: Number, row: BitArray?): BitArray
    override fun getBlackMatrix(): BitMatrix
    override fun createBinarizer(source: LuminanceSource): Binarizer
    open var initArrays: Any

    companion object {
        var LUMINANCE_BITS: Any
        var LUMINANCE_SHIFT: Any
        var LUMINANCE_BUCKETS: Any
        var EMPTY: Any
        var estimateBlackPoint: Any
    }
}