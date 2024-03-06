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

@JsName("Encoder")
open external class Encoder {
    companion object {
        var DEFAULT_EC_PERCENT: int
        var DEFAULT_AZTEC_LAYERS: int
        var MAX_NB_BITS: Any
        var MAX_NB_BITS_COMPACT: Any
        var WORD_SIZE: Any
        fun encodeBytes(data: Uint8Array): AztecCode
        fun encode(data: Uint8Array, minECCPercent: int, userSpecifiedLayers: int): AztecCode
        var drawBullsEye: Any
        fun generateModeMessage(compact: Boolean, layers: int, messageSizeInWords: int): BitArray
        var drawModeMessage: Any
        var generateCheckWords: Any
        var bitsToWords: Any
        var getGF: Any
        fun stuffBits(bits: BitArray, wordSize: int): BitArray
        var totalBitsInLayer: Any
    }
}