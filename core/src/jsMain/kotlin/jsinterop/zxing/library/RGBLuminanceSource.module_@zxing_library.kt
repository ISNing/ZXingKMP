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
open external class RGBLuminanceSource : LuminanceSource {
    constructor(
        luminances: Uint8ClampedArray,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally,
        left: Number = definedExternally,
        top: Number = definedExternally
    )

    constructor(luminances: Uint8ClampedArray, width: Number, height: Number)
    constructor(luminances: Uint8ClampedArray, width: Number, height: Number, dataWidth: Number = definedExternally)
    constructor(
        luminances: Uint8ClampedArray,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally
    )

    constructor(
        luminances: Uint8ClampedArray,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally,
        left: Number = definedExternally
    )

    constructor(
        luminances: Int32Array,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally,
        left: Number = definedExternally,
        top: Number = definedExternally
    )

    constructor(luminances: Int32Array, width: Number, height: Number)
    constructor(luminances: Int32Array, width: Number, height: Number, dataWidth: Number = definedExternally)
    constructor(
        luminances: Int32Array,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally
    )

    constructor(
        luminances: Int32Array,
        width: Number,
        height: Number,
        dataWidth: Number = definedExternally,
        dataHeight: Number = definedExternally,
        left: Number = definedExternally
    )

    open var dataWidth: Any
    open var dataHeight: Any
    open var left: Any
    open var top: Any
    open var luminances: Any
    override fun getRow(y: Number, row: Uint8ClampedArray/* = definedExternally */): Uint8ClampedArray
    override fun getMatrix(): Uint8ClampedArray
    override fun isCropSupported(): Boolean
    override fun crop(left: Number, top: Number, width: Number, height: Number): LuminanceSource
    override fun invert(): LuminanceSource
}