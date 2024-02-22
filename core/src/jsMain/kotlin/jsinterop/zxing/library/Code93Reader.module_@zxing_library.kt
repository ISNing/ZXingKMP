@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("default")
open external class Code93Reader : OneDReader {
    open var decodeRowResult: Any
    open var counters: Any
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    open var findAsteriskPattern: Any
    open var toPattern: Any
    open var patternToChar: Any
    open var decodeExtended: Any
    open var checkChecksums: Any
    open var checkOneChecksum: Any

    companion object {
        var ALPHABET_STRING: Any
        var CHARACTER_ENCODINGS: Any
        var ASTERISK_ENCODING: Any
    }
}