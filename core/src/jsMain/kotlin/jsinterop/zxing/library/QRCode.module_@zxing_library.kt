@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("QRCode")
open external class QRCode {
    open var mode: Any
    open var ecLevel: Any
    open var version: Any
    open var maskPattern: Any
    open var matrix: Any
    open fun getMode(): Mode
    open fun getECLevel(): ErrorCorrectionLevel
    open fun getVersion(): Version
    open fun getMaskPattern(): Number
    open fun getMatrix(): ByteMatrix
    override fun toString(): String
    open fun setMode(value: Mode)
    open fun setECLevel(value: ErrorCorrectionLevel)
    open fun setVersion(version: Version)
    open fun setMaskPattern(value: Number)
    open fun setMatrix(value: ByteMatrix)

    companion object {
        var NUM_MASK_PATTERNS: Number
        fun isValidMaskPattern(maskPattern: Number): Boolean
    }
}