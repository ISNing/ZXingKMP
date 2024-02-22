@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class ModeValues {
    TERMINATOR /* = 0 */,
    NUMERIC /* = 1 */,
    ALPHANUMERIC /* = 2 */,
    STRUCTURED_APPEND /* = 3 */,
    BYTE /* = 4 */,
    ECI /* = 5 */,
    KANJI /* = 6 */,
    FNC1_FIRST_POSITION /* = 7 */,
    FNC1_SECOND_POSITION /* = 8 */,
    HANZI /* = 9 */
}

@JsName("default")
open external class Mode {
    open var value: Any
    open var stringValue: Any
    open var characterCountBitsForVersions: Any
    open var bits: Any
    open fun getCharacterCountBits(version: Version): Number
    open fun getValue(): ModeValues
    open fun getBits(): Number
    override fun equals(other: Any?): Boolean
    override fun toString(): String

    companion object {
        var FOR_BITS: Any
        var FOR_VALUE: Any
        var TERMINATOR: Mode
        var NUMERIC: Mode
        var ALPHANUMERIC: Mode
        var STRUCTURED_APPEND: Mode
        var BYTE: Mode
        var ECI: Mode
        var KANJI: Mode
        var FNC1_FIRST_POSITION: Mode
        var FNC1_SECOND_POSITION: Mode
        var HANZI: Mode
        fun forBits(bits: Number): Mode
    }
}