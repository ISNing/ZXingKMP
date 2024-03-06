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

@JsName("StringEncoding")
open external class StringEncoding {
    companion object {
        var customDecoder: (bytes: Uint8Array, encodingName: String) -> String
        var customEncoder: (s: String, encodingName: String) -> Uint8Array
        fun decode(bytes: Uint8Array, encoding: String): String
        fun decode(bytes: Uint8Array, encoding: CharacterSetECI): String
        var shouldDecodeOnFallback: Any
        fun encode(s: String, encoding: String): Uint8Array
        fun encode(s: String, encoding: CharacterSetECI): Uint8Array
        var isBrowser: Any
        fun encodingName(encoding: String): String
        fun encodingName(encoding: CharacterSetECI): String
        fun encodingCharacterSet(encoding: String): CharacterSetECI
        fun encodingCharacterSet(encoding: CharacterSetECI): CharacterSetECI
        var decodeFallback: Any
        var isDecodeFallbackSupported: Any
        var encodeFallback: Any
    }
}