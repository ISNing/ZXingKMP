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
import org.khronos.webgl.Uint8Array

@JsName("default")
open external class Arrays {
    companion object {
        fun fill(a: Int32Array, param_val: int)
        fun fill(a: Uint8Array, param_val: int)
        fun fill(a: Array<Any>, param_val: int)
        fun fillWithin(a: Int32Array, fromIndex: int, toIndex: int, param_val: int)
        fun rangeCheck(arrayLength: int, fromIndex: int, toIndex: int)
        fun <T> asList(vararg args: T): Array<T>
        fun <T> create(rows: int, cols: int, value: T = definedExternally): Array<Array<T>>
        fun createInt32Array(rows: int, cols: int, value: int = definedExternally): Array<Int32Array>
        fun equals(first: Any, second: Any): Boolean
        fun hashCode(a: Any): Number
        fun fillUint8Array(a: Uint8Array, value: Number)
        fun copyOf(original: Int32Array, newLength: Number): Int32Array
        fun copyOfUint8Array(original: Uint8Array, newLength: Number): Uint8Array
        fun copyOfRange(original: Int32Array, from: Number, to: Number): Int32Array
        fun binarySearch(
            ar: Int32Array,
            el: Number,
            comparator: (a: Number, b: Number) -> Number = definedExternally
        ): Number

        fun numberComparator(a: Number, b: Number): Number
    }
}