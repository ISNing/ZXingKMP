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

@JsName("Decoder")
open external class Decoder {
    open var ddata: Any
    open fun decode(detectorResult: AztecDetectorResult): DecoderResult
    open var correctBits: Any
    open var extractBits: Any
    open var totalBitsInLayer: Any

    companion object {
        var UPPER_TABLE: Any
        var LOWER_TABLE: Any
        var MIXED_TABLE: Any
        var PUNCT_TABLE: Any
        var DIGIT_TABLE: Any
        fun highLevelDecode(correctedBits: Array<Boolean>): String
        var getEncodedData: Any
        var getTable: Any
        var getCharacter: Any
        var readCode: Any
        var readByte: Any
        fun convertBoolArrayToByteArray(boolArr: Array<Boolean>): Uint8Array
    }
}