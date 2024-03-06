@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

// TODO: This class seems not correctly implemented interface Writer (Might be a bug from upstream)

//@JsName("default")
//open external class AztecWriter : Writer {
//    open fun encode(contents: String, format: BarcodeFormat, width: int, height: int): BitMatrix
//    @OptIn(ExperimentalJsCollectionsApi::class)
//    open fun encodeWithHints(contents: String, format: BarcodeFormat, width: int, height: int, hints: JsReadonlyMap<EncodeHintType, Any>): BitMatrix
//
//    companion object {
//        var encodeLayers: Any
//        var renderResult: Any
//    }
//}