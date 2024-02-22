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

@JsName("default")
open external class DecodedBitStreamParser {
    companion object {
        var ALPHANUMERIC_CHARS: Any
        var GB2312_SUBSET: Any
        fun decode(
            bytes: Uint8Array,
            version: Version,
            ecLevel: ErrorCorrectionLevel,
            hints: Map<DecodeHintType, Any>
        ): DecoderResult

        var decodeHanziSegment: Any
        var decodeKanjiSegment: Any
        var decodeByteSegment: Any
        var toAlphaNumericChar: Any
        var decodeAlphanumericSegment: Any
        var decodeNumericSegment: Any
        var parseECIValue: Any
    }
}