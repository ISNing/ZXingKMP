@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Int32Array
import org.khronos.webgl.Uint8ClampedArray

@JsName("default")
open external class PlanarYUVLuminanceSource(
    yuvData: Uint8ClampedArray,
    dataWidth: Number,
    dataHeight: Number,
    left: Number,
    top: Number,
    width: Number,
    height: Number,
    reverseHorizontal: Boolean
) :
    LuminanceSource {
    open var yuvData: Any
    open var dataWidth: Any
    open var dataHeight: Any
    open var left: Any
    open var top: Any
    override fun getRow(y: Number, row: Uint8ClampedArray/* = definedExternally */): Uint8ClampedArray
    override fun getMatrix(): Uint8ClampedArray
    override fun isCropSupported(): Boolean
    override fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource
    open fun renderThumbnail(): Int32Array
    open fun getThumbnailWidth(): Number
    open fun getThumbnailHeight(): Number
    open var reverseHorizontal: Any
    override fun invert(): LuminanceSource

    companion object {
        var THUMBNAIL_SCALE_FACTOR: Any
    }
}