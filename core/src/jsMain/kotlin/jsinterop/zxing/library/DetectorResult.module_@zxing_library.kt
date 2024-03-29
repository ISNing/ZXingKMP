@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("DetectorResult")
open external class DetectorResult(bits: BitMatrix, points: Array<ResultPoint>) {
    open var bits: Any
    open var points: Any
    open fun getBits(): BitMatrix
    open fun getPoints(): Array<ResultPoint>
}