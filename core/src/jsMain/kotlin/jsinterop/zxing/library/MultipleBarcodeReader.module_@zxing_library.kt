@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import kotlin.js.collections.JsReadonlyMap

external interface MultipleBarcodeReader {
    fun decodeMultiple(image: BinaryBitmap): Array<Result>
    @OptIn(ExperimentalJsCollectionsApi::class)
    fun decodeMultiple(image: BinaryBitmap, hints: JsReadonlyMap<DecodeHintType, Any>): Array<Result>
}