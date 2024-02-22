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
open external class DataMatrixWriter : Writer {
    override fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Number,
        height: Number,
        hints: Map<EncodeHintType, Any>/* = definedExternally */
    ): BitMatrix

    open var encodeLowLevel: Any
    open var convertByteMatrixToBitMatrix: Any
}