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

external interface `T$5` {
    var rowOffset: Number
    var resultString: String
}

@JsName("default")
open external class EAN13Reader : UPCEANReader {
    open var decodeMiddleCounters: Any
    override fun decodeMiddle(row: BitArray, startRange: Int32Array, resultString: String): `T$5`
    override fun getBarcodeFormat(): BarcodeFormat

    companion object {
        var FIRST_DIGIT_ENCODINGS: Any
        fun determineFirstDigit(resultString: String, lgPatternFound: Number): String
    }
}