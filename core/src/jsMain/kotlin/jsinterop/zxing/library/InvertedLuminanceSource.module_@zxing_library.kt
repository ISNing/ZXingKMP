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

@JsName("InvertedLuminanceSource")
open external class InvertedLuminanceSource(delegate: LuminanceSource) :
    LuminanceSource {
    open var delegate: Any
    override fun getRow(y: Number, row: Uint8ClampedArray?/* = definedExternally */): Uint8ClampedArray
    override fun getMatrix(): Uint8ClampedArray
    override fun isCropSupported(): Boolean
    override fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource
    override fun isRotateSupported(): Boolean
    override fun invert(): LuminanceSource
    override fun rotateCounterClockwise(): LuminanceSource
    override fun rotateCounterClockwise45(): LuminanceSource
}