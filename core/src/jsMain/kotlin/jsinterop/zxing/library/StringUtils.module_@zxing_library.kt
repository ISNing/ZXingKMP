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
open external class StringUtils {
    companion object {
        var SHIFT_JIS: String
        var GB2312: String
        var ISO88591: String
        var EUC_JP: Any
        var UTF8: Any
        var PLATFORM_DEFAULT_ENCODING: Any
        var ASSUME_SHIFT_JIS: Any
        fun castAsNonUtf8Char(code: Number, encoding: Charset = definedExternally): String
        fun guessEncoding(bytes: Uint8Array, hints: Map<DecodeHintType, Any>): String
        fun format(append: String, vararg args: Any): String
        fun getBytes(str: String, encoding: CharacterSetECI): Uint8Array
        fun getCharCode(str: String, index: Number = definedExternally): int
        fun getCharAt(charCode: Number): String
    }
}