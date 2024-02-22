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
open external class RSSExpandedReader : AbstractRSSReader {
    open var pairs: Any
    open var rows: Any
    open var startEnd: Any
    open var startFromEven: Any
    override fun decodeRow(rowNumber: Number, row: BitArray, hints: Map<DecodeHintType, Any>): Result
    override fun reset()
    open fun decodeRow2pairs(rowNumber: Number, row: BitArray): Array<ExpandedPair>
    open var checkRowsBoolean: Any
    open var checkRows: Any
    open var storeRow: Any
    open var removePartialRows: Any
    open fun getRows(): Any
    open var checkChecksum: Any
    open fun retrieveNextPair(row: BitArray, previousPairs: Array<ExpandedPair>, rowNumber: Number): ExpandedPair
    open fun isEmptyPair(pairs: Any): Boolean
    open var findNextPair: Any
    open var parseFoundFinderPattern: Any
    open fun decodeDataCharacter(
        row: BitArray,
        pattern: FinderPattern,
        isOddPattern: Boolean,
        leftChar: Boolean
    ): DataCharacter

    open var adjustOddEvenCounts: Any

    companion object {
        var SYMBOL_WIDEST: Any
        var EVEN_TOTAL_SUBSET: Any
        var GSUM: Any
        var FINDER_PATTERNS: Any
        var WEIGHTS: Any
        var FINDER_PAT_A: Any
        var FINDER_PAT_B: Any
        var FINDER_PAT_C: Any
        var FINDER_PAT_D: Any
        var FINDER_PAT_E: Any
        var FINDER_PAT_F: Any
        var FINDER_PATTERN_SEQUENCES: Any
        var MAX_PAIRS: Any
        var isValidSequence: Any
        var isPartialRow: Any
        fun constructResult(pairs: Array<ExpandedPair>): Result
        var getNextSecondBar: Any
        var reverseCounters: Any
        var isNotA1left: Any
    }
}