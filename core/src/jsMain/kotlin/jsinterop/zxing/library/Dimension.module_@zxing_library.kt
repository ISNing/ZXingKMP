@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("Dimension")
open external class Dimension(width: Number, height: Number) {
    open var width: Any
    open var height: Any
    open fun getWidth(): Number
    open fun getHeight(): Number
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Number
    override fun toString(): String
}