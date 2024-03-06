@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("RSS14Reader")
open external class RSS14Reader : AbstractRSSReader {
    open var possibleLeftPairs: Any
    open var possibleRightPairs: Any
    override fun decodeRow(
        rowNumber: Number,
        row: BitArray,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Result

    override fun reset()
    open var decodePair: Any
    open var decodeDataCharacter: Any
    open var findFinderPattern: Any
    open var parseFoundFinderPattern: Any
    open var adjustOddEvenCounts: Any

    companion object {
        var OUTSIDE_EVEN_TOTAL_SUBSET: Any
        var INSIDE_ODD_TOTAL_SUBSET: Any
        var OUTSIDE_GSUM: Any
        var INSIDE_GSUM: Any
        var OUTSIDE_ODD_WIDEST: Any
        var INSIDE_ODD_WIDEST: Any
        var FINDER_PATTERNS: Any
        var addOrTally: Any
        var constructResult: Any
        var checkChecksum: Any
    }
}