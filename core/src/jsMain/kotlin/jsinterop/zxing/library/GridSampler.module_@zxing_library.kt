@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Float32Array

@JsName("GridSampler")
open external class GridSampler {
    open fun sampleGrid(
        image: BitMatrix,
        dimensionX: Number,
        dimensionY: Number,
        p1ToX: Number,
        p1ToY: Number,
        p2ToX: Number,
        p2ToY: Number,
        p3ToX: Number,
        p3ToY: Number,
        p4ToX: Number,
        p4ToY: Number,
        p1FromX: Number,
        p1FromY: Number,
        p2FromX: Number,
        p2FromY: Number,
        p3FromX: Number,
        p3FromY: Number,
        p4FromX: Number,
        p4FromY: Number
    ): BitMatrix

    open fun sampleGridWithTransform(
        image: BitMatrix,
        dimensionX: Number,
        dimensionY: Number,
        transform: PerspectiveTransform
    ): BitMatrix

    companion object {
        fun checkAndNudgePoints(image: BitMatrix, points: Float32Array)
    }
}