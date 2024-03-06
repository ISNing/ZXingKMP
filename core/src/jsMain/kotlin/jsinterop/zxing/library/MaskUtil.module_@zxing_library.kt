@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("MaskUtil")
open external class MaskUtil {
    companion object {
        var N1: Any
        var N2: Any
        var N3: Any
        var N4: Any
        fun applyMaskPenaltyRule1(matrix: ByteMatrix): Number
        fun applyMaskPenaltyRule2(matrix: ByteMatrix): Number
        fun applyMaskPenaltyRule3(matrix: ByteMatrix): Number
        var isWhiteHorizontal: Any
        var isWhiteVertical: Any
        fun applyMaskPenaltyRule4(matrix: ByteMatrix): Number
        fun getDataMaskBit(maskPattern: Number, x: Number, y: Number): Boolean
        var applyMaskPenaltyRule1Internal: Any
    }
}