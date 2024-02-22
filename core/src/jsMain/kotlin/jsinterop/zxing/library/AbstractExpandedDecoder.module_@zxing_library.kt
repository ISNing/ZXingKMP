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
abstract external class AbstractExpandedDecoder(information: BitArray) {
    open var information: Any
    open var generalDecoder: Any
    open fun getInformation(): BitArray
    open fun getGeneralDecoder(): GeneralAppIdDecoder
    open fun parseInformation(): String
}