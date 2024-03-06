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

@JsName("DecoderResult")
open external class DecoderResult(
    rawBytes: Uint8Array,
    text: String,
    byteSegments: Array<Uint8Array>,
    ecLevel: String,
    structuredAppendSequenceNumber: Number = definedExternally,
    structuredAppendParity: Number = definedExternally
) {
    open var rawBytes: Any
    open var text: Any
    open var byteSegments: Any
    open var ecLevel: Any
    open var structuredAppendSequenceNumber: Any
    open var structuredAppendParity: Any
    open var numBits: Any
    open var errorsCorrected: Any
    open var erasures: Any
    open var other: Any
    open fun getRawBytes(): Uint8Array
    open fun getNumBits(): Number
    open fun setNumBits(numBits: Number)
    open fun getText(): String
    open fun getByteSegments(): Array<Uint8Array>
    open fun getECLevel(): String
    open fun getErrorsCorrected(): Number
    open fun setErrorsCorrected(errorsCorrected: Number)
    open fun getErasures(): Number
    open fun setErasures(erasures: Number)
    open fun getOther(): Any
    open fun setOther(other: Any)
    open fun hasStructuredAppend(): Boolean
    open fun getStructuredAppendParity(): Number
    open fun getStructuredAppendSequenceNumber(): Number
}