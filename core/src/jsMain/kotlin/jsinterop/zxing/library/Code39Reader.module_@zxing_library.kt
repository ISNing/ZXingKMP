@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import kotlin.js.collections.JsReadonlyMap

@JsName("Code39Reader")
open external class Code39Reader(
    usingCheckDigit: Boolean = definedExternally,
    extendedMode: Boolean = definedExternally
) :
    OneDReader {
    open var usingCheckDigit: Any
    open var extendedMode: Any
    open var decodeRowResult: Any
    open var counters: Any
    @OptIn(ExperimentalJsCollectionsApi::class)
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: JsReadonlyMap<DecodeHintType, Any>/* = definedExternally */
    ): Result

    companion object {
        var ALPHABET_STRING: Any
        var CHARACTER_ENCODINGS: Any
        var ASTERISK_ENCODING: Any
        var findAsteriskPattern: Any
        var toNarrowWidePattern: Any
        var patternToChar: Any
        var decodeExtended: Any
    }
}