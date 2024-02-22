@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class ErrorCorrectionLevelValues {
    L /* = 0 */,
    M /* = 1 */,
    Q /* = 2 */,
    H /* = 3 */
}

@JsName("default")
open external class ErrorCorrectionLevel {
    open var value: Any
    open var stringValue: Any
    open var bits: Any
    open fun getValue(): ErrorCorrectionLevelValues
    open fun getBits(): Number
    override fun toString(): String
    override fun equals(other: Any?): Boolean

    companion object {
        var FOR_BITS: Any
        var FOR_VALUE: Any
        var L: ErrorCorrectionLevel
        var M: ErrorCorrectionLevel
        var Q: ErrorCorrectionLevel
        var H: ErrorCorrectionLevel
        fun fromString(s: String): ErrorCorrectionLevel
        fun forBits(bits: Number): ErrorCorrectionLevel
    }
}