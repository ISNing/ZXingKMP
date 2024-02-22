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
open external class BitMatrix(
    width: Number,
    height: Number = definedExternally,
    rowSize: Number = definedExternally,
    bits: Int32Array = definedExternally
) {
    open var width: Any
    open var height: Any
    open var rowSize: Any
    open var bits: Any
    open fun get(x: Number, y: Number): Boolean
    open fun set(x: Number, y: Number)
    open fun unset(x: Number, y: Number)
    open fun flip(x: Number, y: Number)
    open fun xor(mask: BitMatrix)
    open fun clear()
    open fun setRegion(left: Number, top: Number, width: Number, height: Number)
    open fun getRow(y: Number, row: BitArray = definedExternally): BitArray
    open fun setRow(y: Number, row: BitArray)
    open fun rotate180()
    open fun getEnclosingRectangle(): Int32Array
    open fun getTopLeftOnBit(): Int32Array
    open fun getBottomRightOnBit(): Int32Array
    open fun getWidth(): Number
    open fun getHeight(): Number
    open fun getRowSize(): Number
    override fun equals(other: Any?): Boolean
    override fun hashCode(): int
    open fun toString(
        setString: String = definedExternally,
        unsetString: String = definedExternally,
        lineSeparator: String = definedExternally
    ): String

    open var buildToString: Any
    open fun clone(): BitMatrix

    companion object {
        fun parseFromBooleanArray(image: Array<Array<Boolean>>): BitMatrix
        fun parseFromString(stringRepresentation: String, setString: String, unsetString: String): BitMatrix
    }
}