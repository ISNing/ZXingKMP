@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Uint8ClampedArray

@JsName("LuminanceSource")
open external class LuminanceSource(width: Number, height: Number) {
    open var width: Number
    open var height: Number
    open fun getRow(y: Number, row: Uint8ClampedArray?/* = definedExternally */): Uint8ClampedArray
    open fun getMatrix(): Uint8ClampedArray
    open fun getWidth(): Number
    open fun getHeight(): Number
    open fun isCropSupported(): Boolean
    open fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource
    open fun isRotateSupported(): Boolean
    open fun invert(): LuminanceSource
    open fun rotateCounterClockwise(): LuminanceSource
    open fun rotateCounterClockwise45(): LuminanceSource
    override fun toString(): String
}