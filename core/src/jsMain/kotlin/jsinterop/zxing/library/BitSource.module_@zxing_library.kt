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

@JsName("BitSource")
open external class BitSource(bytes: Uint8Array) {
    open var bytes: Any
    open var byteOffset: Any
    open var bitOffset: Any
    open fun getBitOffset(): Number
    open fun getByteOffset(): Number
    open fun readBits(numBits: Number): Number
    open fun available(): Number
}