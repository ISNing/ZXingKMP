@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Int32Array

external enum class CharacterSetValueIdentifiers {
    Cp437 /* = 0 */,
    ISO8859_1 /* = 1 */,
    ISO8859_2 /* = 2 */,
    ISO8859_3 /* = 3 */,
    ISO8859_4 /* = 4 */,
    ISO8859_5 /* = 5 */,
    ISO8859_6 /* = 6 */,
    ISO8859_7 /* = 7 */,
    ISO8859_8 /* = 8 */,
    ISO8859_9 /* = 9 */,
    ISO8859_10 /* = 10 */,
    ISO8859_11 /* = 11 */,
    ISO8859_13 /* = 12 */,
    ISO8859_14 /* = 13 */,
    ISO8859_15 /* = 14 */,
    ISO8859_16 /* = 15 */,
    SJIS /* = 16 */,
    Cp1250 /* = 17 */,
    Cp1251 /* = 18 */,
    Cp1252 /* = 19 */,
    Cp1256 /* = 20 */,
    UnicodeBigUnmarked /* = 21 */,
    UTF8 /* = 22 */,
    ASCII /* = 23 */,
    Big5 /* = 24 */,
    GB18030 /* = 25 */,
    EUC_KR /* = 26 */
}

@JsName("CharacterSetECI")
open external class CharacterSetECI {
    open var valueIdentifier: CharacterSetValueIdentifiers
    open var name: String
    open var values: Int32Array
    open var otherEncodingNames: Array<String>

    constructor(
        valueIdentifier: CharacterSetValueIdentifiers,
        valuesParam: Int32Array,
        name: String,
        vararg otherEncodingNames: String
    )

    constructor(
        valueIdentifier: CharacterSetValueIdentifiers,
        valuesParam: Number,
        name: String,
        vararg otherEncodingNames: String
    )

    open fun getValueIdentifier(): CharacterSetValueIdentifiers
    open fun getName(): String
    open fun getValue(): Number
    open fun equals(o: CharacterSetECI): Boolean

    companion object {
        var VALUE_IDENTIFIER_TO_ECI: Any
        var VALUES_TO_ECI: Any
        var NAME_TO_ECI: Any
        var Cp437: CharacterSetECI
        var ISO8859_1: CharacterSetECI
        var ISO8859_2: CharacterSetECI
        var ISO8859_3: CharacterSetECI
        var ISO8859_4: CharacterSetECI
        var ISO8859_5: CharacterSetECI
        var ISO8859_6: CharacterSetECI
        var ISO8859_7: CharacterSetECI
        var ISO8859_8: CharacterSetECI
        var ISO8859_9: CharacterSetECI
        var ISO8859_10: CharacterSetECI
        var ISO8859_11: CharacterSetECI
        var ISO8859_13: CharacterSetECI
        var ISO8859_14: CharacterSetECI
        var ISO8859_15: CharacterSetECI
        var ISO8859_16: CharacterSetECI
        var SJIS: CharacterSetECI
        var Cp1250: CharacterSetECI
        var Cp1251: CharacterSetECI
        var Cp1252: CharacterSetECI
        var Cp1256: CharacterSetECI
        var UnicodeBigUnmarked: CharacterSetECI
        var UTF8: CharacterSetECI
        var ASCII: CharacterSetECI
        var Big5: CharacterSetECI
        var GB18030: CharacterSetECI
        var EUC_KR: CharacterSetECI
        fun getCharacterSetECIByValue(value: Number): CharacterSetECI
        fun getCharacterSetECIByName(name: String): CharacterSetECI
    }
}