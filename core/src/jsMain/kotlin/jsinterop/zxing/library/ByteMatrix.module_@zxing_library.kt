@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Uint8Array

@JsName("ByteMatrix")
open external class ByteMatrix(width: Number, height: Number) {
    open var width: Any
    open var height: Any
    open var bytes: Any
    open fun getHeight(): Number
    open fun getWidth(): Number
    open fun get(x: Number, y: Number): Number
    open fun getArray(): Array<Uint8Array>
    open fun setNumber(x: Number, y: Number, value: Number)
    open fun setBoolean(x: Number, y: Number, value: Boolean)
    open fun clear(value: Number)
    override fun equals(other: Any?): Boolean
    override fun toString(): String
}