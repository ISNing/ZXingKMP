@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("GeneralAppIdDecoder")
open external class GeneralAppIdDecoder(information: BitArray) {
    open var information: Any
    open var current: Any
    open var buffer: Any
    open fun decodeAllCodes(buff: StringBuilder, initialPosition: Number): String
    open var isStillNumeric: Any
    open var decodeNumeric: Any
    open fun extractNumericValueFromBitArray(pos: Number, bits: Number): Number
    open fun decodeGeneralPurposeField(pos: Number, remaining: String): DecodedInformation
    open var parseBlocks: Any
    open var parseNumericBlock: Any
    open var parseIsoIec646Block: Any
    open var parseAlphaBlock: Any
    open var isStillIsoIec646: Any
    open var decodeIsoIec646: Any
    open var isStillAlpha: Any
    open var decodeAlphanumeric: Any
    open var isAlphaTo646ToAlphaLatch: Any
    open var isAlphaOr646ToNumericLatch: Any
    open var isNumericToAlphaNumericLatch: Any

    companion object {
        fun extractNumericValueFromBitArray(information: BitArray, pos: Number, bits: Number): Number
    }
}