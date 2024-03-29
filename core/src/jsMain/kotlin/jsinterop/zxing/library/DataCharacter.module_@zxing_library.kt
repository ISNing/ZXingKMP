@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("DataCharacter")
open external class DataCharacter(value: Number, checksumPortion: Number) {
    open var value: Any
    open var checksumPortion: Any
    open fun getValue(): Number
    open fun getChecksumPortion(): Number
    override fun toString(): String
    override fun equals(o: Any?): Boolean
    override fun hashCode(): Number
}