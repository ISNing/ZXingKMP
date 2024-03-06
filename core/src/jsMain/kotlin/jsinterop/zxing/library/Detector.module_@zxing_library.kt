@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

open external class Point(x: Number, y: Number) {
    open var x: Any
    open var y: Any
    open fun toResultPoint(): ResultPoint
    open fun getX(): Number
    open fun getY(): Number
}

@JsName("Detector")
open external class Detector(image: BitMatrix) {
    open var EXPECTED_CORNER_BITS: Any
    open var image: Any
    open var compact: Any
    open var nbLayers: Any
    open var nbDataBlocks: Any
    open var nbCenterLayers: Any
    open var shift: Any
    open fun detect(): AztecDetectorResult
    open fun detectMirror(isMirror: Boolean): AztecDetectorResult
    open var extractParameters: Any
    open var getRotation: Any
    open var getCorrectedParameterData: Any
    open var getBullsEyeCorners: Any
    open var getMatrixCenter: Any
    open var getMatrixCornerPoints: Any
    open var sampleGrid: Any
    open var sampleLine: Any
    open var isWhiteOrBlackRectangle: Any
    open var getColor: Any
    open var getFirstDifferent: Any
    open var expandSquare: Any
    open var isValid: Any
    open var isValidPoint: Any
    open var distancePoint: Any
    open var distanceResultPoint: Any
    open var getDimension: Any
}