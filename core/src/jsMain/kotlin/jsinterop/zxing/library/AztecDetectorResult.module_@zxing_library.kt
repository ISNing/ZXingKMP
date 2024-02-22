@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("default")
open external class AztecDetectorResult(
    bits: BitMatrix,
    points: Array<ResultPoint>,
    compact: Boolean,
    nbDatablocks: Number,
    nbLayers: Number
) :
    DetectorResult {
    open var compact: Any
    open var nbDatablocks: Any
    open var nbLayers: Any
    open fun getNbLayers(): Number
    open fun getNbDatablocks(): Number
    open fun isCompact(): Boolean
}