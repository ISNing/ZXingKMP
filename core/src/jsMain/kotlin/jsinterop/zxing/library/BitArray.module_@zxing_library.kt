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
open external class BitArray(size: Number = definedExternally, bits: Int32Array = definedExternally) {
    open var size: Any
    open var bits: Any
    open fun getSize(): Number
    open fun getSizeInBytes(): Number
    open var ensureCapacity: Any
    open fun get(i: Number): Boolean
    open fun set(i: Number)
    open fun flip(i: Number)
    open fun getNextSet(from: Number): Number
    open fun getNextUnset(from: Number): Number
    open fun setBulk(i: Number, newBits: Number)
    open fun setRange(start: Number, end: Number)
    open fun clear()
    open fun isRange(start: Number, end: Number, value: Boolean): Boolean
    open fun appendBit(bit: Boolean)
    open fun appendBits(value: Number, numBits: Number)
    open fun appendBitArray(other: BitArray)
    open fun xor(other: BitArray)
    open fun toBytes(bitOffset: Number, array: Uint8Array, offset: Number, numBytes: Number)
    open fun getBitArray(): Int32Array
    open fun reverse()
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Number
    override fun toString(): String
    open fun clone(): BitArray
    open fun toArray(): Array<Boolean>

    companion object {
        var makeArray: Any
    }
}