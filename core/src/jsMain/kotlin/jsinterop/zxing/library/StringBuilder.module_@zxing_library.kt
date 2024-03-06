@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("StringBuilder")
open external class StringBuilder(value: String = definedExternally) {
    open var value: Any
    open var encoding: Any
    open fun enableDecoding(encoding: CharacterSetECI): StringBuilder
    open fun append(s: String): StringBuilder
    open fun append(s: Number): StringBuilder
    open fun appendChars(str: Array<char>, offset: int, len: int): StringBuilder
    open fun appendChars(str: Array<String>, offset: int, len: int): StringBuilder
    open fun length(): Number
    open fun charAt(n: Number): String
    open fun deleteCharAt(n: Number)
    open fun setCharAt(n: Number, c: String)
    open fun substring(start: int, end: int): String
    open fun setLengthToZero()
    override fun toString(): String
    open fun insert(n: Number, c: String)
}