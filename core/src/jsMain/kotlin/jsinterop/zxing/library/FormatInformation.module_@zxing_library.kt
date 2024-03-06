@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("FormatInformation")
open external class FormatInformation {
    open var errorCorrectionLevel: Any
    open var dataMask: Any
    open fun getErrorCorrectionLevel(): ErrorCorrectionLevel
    open fun getDataMask(): Number
    override fun hashCode(): Number
    override fun equals(other: Any?): Boolean

    companion object {
        var FORMAT_INFO_MASK_QR: Any
        var FORMAT_INFO_DECODE_LOOKUP: Any
        fun numBitsDiffering(a: Number, b: Number): Number
        fun decodeFormatInformation(maskedFormatInfo1: Number, maskedFormatInfo2: Number): FormatInformation
        var doDecodeFormatInformation: Any
    }
}