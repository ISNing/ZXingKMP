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
open external class MatrixUtil {
    companion object {
        var POSITION_DETECTION_PATTERN: Any
        var POSITION_ADJUSTMENT_PATTERN: Any
        var POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE: Any
        var TYPE_INFO_COORDINATES: Any
        var VERSION_INFO_POLY: Any
        var TYPE_INFO_POLY: Any
        var TYPE_INFO_MASK_PATTERN: Any
        fun clearMatrix(matrix: ByteMatrix)
        fun buildMatrix(
            dataBits: BitArray,
            ecLevel: ErrorCorrectionLevel,
            version: Version,
            maskPattern: Number,
            matrix: ByteMatrix
        )

        fun embedBasicPatterns(version: Version, matrix: ByteMatrix)
        fun embedTypeInfo(ecLevel: ErrorCorrectionLevel, maskPattern: Number, matrix: ByteMatrix)
        fun maybeEmbedVersionInfo(version: Version, matrix: ByteMatrix)
        fun embedDataBits(dataBits: BitArray, maskPattern: Number, matrix: ByteMatrix)
        fun findMSBSet(value: Number): Number
        fun calculateBCHCode(value: Number, poly: Number): Number
        fun makeTypeInfoBits(ecLevel: ErrorCorrectionLevel, maskPattern: Number, bits: BitArray)
        fun makeVersionInfoBits(version: Version, bits: BitArray)
        var isEmpty: Any
        var embedTimingPatterns: Any
        var embedDarkDotAtLeftBottomCorner: Any
        var embedHorizontalSeparationPattern: Any
        var embedVerticalSeparationPattern: Any
        var embedPositionAdjustmentPattern: Any
        var embedPositionDetectionPattern: Any
        var embedPositionDetectionPatternsAndSeparators: Any
        var maybeEmbedPositionAdjustmentPatterns: Any
    }
}