@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library


open external class BrowserMultiFormatReader(
    hints: Map<DecodeHintType, Any> = definedExternally,
    timeBetweenScansMillis: Number = definedExternally
) :
    BrowserCodeReader {
    override var reader: Any
    override fun decodeBitmap(binaryBitmap: BinaryBitmap): Result
}