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

@JsName("default")
abstract external class AbstractGenericGF {
    open var expTable: Int32Array
    open var logTable: Int32Array
    open fun getZero(): Any
    open fun buildMonomial(degree: Number, coefficient: Number): Any
    override fun equals(other: Any?): Boolean
    open fun multiply(a: Number, b: Number): Number
    open fun inverse(a: Number): Number
    open fun exp(a: Number): Number
    open fun log(a: Number): Number

    companion object {
        fun addOrSubtract(a: Number, b: Number): Number
    }
}