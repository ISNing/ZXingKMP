@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Uint8Array
import kotlin.js.collections.JsReadonlyMap


@JsName("Result")
open external class Result(
    text: String,
    rawBytes: Uint8Array,
    numBits: Number,
    resultPoints: Array<ResultPoint>,
    format: BarcodeFormat,
    timestamp: Number = definedExternally
) {
    open var text: Any
    open var rawBytes: Any
    open var numBits: Any
    open var resultPoints: Any
    open var format: Any
    open var timestamp: Any
    open var resultMetadata: Any?
    open fun getText(): String
    open fun getRawBytes(): Uint8Array
    open fun getNumBits(): Number
    open fun getResultPoints(): Array<ResultPoint>
    open fun getBarcodeFormat(): BarcodeFormat
    @OptIn(ExperimentalJsCollectionsApi::class)
    open fun getResultMetadata(): JsReadonlyMap<ResultMetadataType, Any>?
    open fun putMetadata(type: ResultMetadataType, value: Any)
    @OptIn(ExperimentalJsCollectionsApi::class)
    open fun putAllMetadata(metadata: JsReadonlyMap<ResultMetadataType, Any>)
    open fun addResultPoints(newPoints: Array<ResultPoint>)
    open fun getTimestamp(): Number
    override fun toString(): String
}