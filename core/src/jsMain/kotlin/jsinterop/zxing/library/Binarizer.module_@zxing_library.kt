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
open external class Binarizer(source: LuminanceSource) {
    open var source: Any
    open fun getLuminanceSource(): LuminanceSource
    open fun getBlackRow(y: Number, row: BitArray?): BitArray
    open fun getBlackMatrix(): BitMatrix
    open fun createBinarizer(source: LuminanceSource): Binarizer
    open fun getWidth(): Number
    open fun getHeight(): Number
}