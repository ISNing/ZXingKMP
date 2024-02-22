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
open external class DecodedInformation(
    newPosition: Number,
    newString: String,
    remainingValue: Number = definedExternally
) :
    DecodedObject {
    open var newString: Any
    open var remainingValue: Any
    open var remaining: Any
    open fun getNewString(): String
    open fun isRemaining(): Boolean
    open fun getRemainingValue(): Number
}