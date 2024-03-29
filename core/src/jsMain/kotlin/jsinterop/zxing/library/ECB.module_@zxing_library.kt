@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("ECB")
open external class ECB(count: Number, dataCodewords: Number) {
    open var count: Any
    open var dataCodewords: Any
    open fun getCount(): Number
    open fun getDataCodewords(): Number
}