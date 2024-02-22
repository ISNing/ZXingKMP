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

@JsName("default")
open external class PerspectiveTransform {
    open var a11: Any
    open var a21: Any
    open var a31: Any
    open var a12: Any
    open var a22: Any
    open var a32: Any
    open var a13: Any
    open var a23: Any
    open var a33: Any
    open fun transformPoints(points: Float32Array)
    open fun transformPointsWithValues(xValues: Float32Array, yValues: Float32Array)
    open fun buildAdjoint(): PerspectiveTransform
    open fun times(other: PerspectiveTransform): PerspectiveTransform

    companion object {
        fun quadrilateralToQuadrilateral(
            x0: Number,
            y0: Number,
            x1: Number,
            y1: Number,
            x2: Number,
            y2: Number,
            x3: Number,
            y3: Number,
            x0p: Number,
            y0p: Number,
            x1p: Number,
            y1p: Number,
            x2p: Number,
            y2p: Number,
            x3p: Number,
            y3p: Number
        ): PerspectiveTransform

        fun squareToQuadrilateral(
            x0: Number,
            y0: Number,
            x1: Number,
            y1: Number,
            x2: Number,
            y2: Number,
            x3: Number,
            y3: Number
        ): PerspectiveTransform

        fun quadrilateralToSquare(
            x0: Number,
            y0: Number,
            x1: Number,
            y1: Number,
            x2: Number,
            y2: Number,
            x3: Number,
            y3: Number
        ): PerspectiveTransform
    }
}