@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("BinaryBitmap")
open external class BinaryBitmap(binarizer: Binarizer) {
    open var binarizer: Any
    open var matrix: Any
    open fun getWidth(): Number
    open fun getHeight(): Number
    open fun getBlackRow(y: Number, row: BitArray): BitArray
    open fun getBlackMatrix(): BitMatrix
    open fun isCropSupported(): Boolean
    open fun crop(left: Number, top: Number, width: Number, height: Number): BinaryBitmap
    open fun isRotateSupported(): Boolean
    open fun rotateCounterClockwise(): BinaryBitmap
    open fun rotateCounterClockwise45(): BinaryBitmap
    override fun toString(): String
}