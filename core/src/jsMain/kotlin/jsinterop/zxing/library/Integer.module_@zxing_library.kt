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
open external class Integer {
    companion object {
        var MIN_VALUE_32_BITS: Number
        var MAX_VALUE: Number
        fun numberOfTrailingZeros(i: Number): Number
        fun numberOfLeadingZeros(i: Number): Number
        fun toHexString(i: Number): String
        fun toBinaryString(intNumber: Number): String
        fun bitCount(i: Number): Number
        fun truncDivision(dividend: Number, divisor: Number): Number
        fun parseInt(num: String, radix: Number = definedExternally): Number
    }
}