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

@JsName("GenericGFPoly")
open external class GenericGFPoly(field: AbstractGenericGF, coefficients: Int32Array) {
    open var field: Any
    open var coefficients: Any
    open fun getCoefficients(): Int32Array
    open fun getDegree(): Number
    open fun isZero(): Boolean
    open fun getCoefficient(degree: Number): Number
    open fun evaluateAt(a: Number): Number
    open fun addOrSubtract(other: GenericGFPoly): GenericGFPoly
    open fun multiply(other: GenericGFPoly): GenericGFPoly
    open fun multiplyScalar(scalar: Number): GenericGFPoly
    open fun multiplyByMonomial(degree: Number, coefficient: Number): GenericGFPoly
    open fun divide(other: GenericGFPoly): Array<GenericGFPoly>
    override fun toString(): String
}