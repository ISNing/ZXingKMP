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
open external class GenericGF(primitive: Number, size: Number, generatorBase: Number) :
    AbstractGenericGF {
    open var primitive: Any
    open var size: Any
    open var generatorBase: Any
    open var zero: Any
    open var one: Any
    override fun getZero(): GenericGFPoly
    open fun getOne(): GenericGFPoly
    override fun buildMonomial(degree: Number, coefficient: Number): GenericGFPoly
    override fun inverse(a: Number): Number
    override fun multiply(a: Number, b: Number): Number
    open fun getSize(): Number
    open fun getGeneratorBase(): Number
    override fun toString(): String
    override fun equals(other: Any?): Boolean

    companion object {
        var AZTEC_DATA_12: GenericGF
        var AZTEC_DATA_10: GenericGF
        var AZTEC_DATA_6: GenericGF
        var AZTEC_PARAM: GenericGF
        var QR_CODE_FIELD_256: GenericGF
        var DATA_MATRIX_FIELD_256: GenericGF
        var AZTEC_DATA_8: GenericGF
        var MAXICODE_FIELD_64: GenericGF
    }
}