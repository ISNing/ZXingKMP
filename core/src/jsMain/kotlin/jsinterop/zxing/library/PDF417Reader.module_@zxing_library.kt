@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("PDF417Reader")
open external class PDF417Reader : Reader,
    MultipleBarcodeReader {
    override fun decode(image: BinaryBitmap, hints: Map<DecodeHintType, Any?>/* = definedExternally */): Result
    override fun decodeMultiple(image: BinaryBitmap): Array<Result>
    override fun decodeMultiple(
        image: BinaryBitmap,
        hints: Map<DecodeHintType, Any>/* = definedExternally */
    ): Array<Result>

    override fun reset()

    companion object {
        var decode: Any
        var getMaxWidth: Any
        var getMinWidth: Any
        var getMaxCodewordWidth: Any
        var getMinCodewordWidth: Any
    }
}