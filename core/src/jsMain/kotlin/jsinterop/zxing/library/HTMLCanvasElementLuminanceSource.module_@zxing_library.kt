@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Uint8ClampedArray
import org.w3c.dom.HTMLCanvasElement

open external class HTMLCanvasElementLuminanceSource(canvas: HTMLCanvasElement) :
    LuminanceSource {
    open var canvas: Any
    open var buffer: Any
    open var tempCanvasElement: Any
    override fun getRow(y: Number, row: Uint8ClampedArray): Uint8ClampedArray
    override fun getMatrix(): Uint8ClampedArray
    override fun isCropSupported(): Boolean
    override fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource
    override fun isRotateSupported(): Boolean
    override fun rotateCounterClockwise(): LuminanceSource
    override fun rotateCounterClockwise45(): LuminanceSource
    open var getTempCanvasElement: Any
    open var rotate: Any
    override fun invert(): LuminanceSource

    companion object {
        var DEGREE_TO_RADIANS: Any
        var FRAME_INDEX: Any
        var makeBufferFromCanvasImageData: Any
        var toGrayscaleBuffer: Any
    }
}