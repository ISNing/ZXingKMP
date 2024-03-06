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

@JsName("UPCEANReader")
open external class UPCEANReader : AbstractUPCEANReader {
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    companion object {
        fun checkChecksum(s: String): Boolean
        fun checkStandardUPCEANChecksum(s: String): Boolean
        fun getStandardUPCEANChecksum(s: String): Number
        fun decodeEnd(row: BitArray, endStart: Number): Int32Array
    }
}