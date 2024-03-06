@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("ECBlocks")
open external class ECBlocks(ecCodewordsPerBlock: Number, vararg ecBlocks: ECB) {
    open var ecCodewordsPerBlock: Any
    open var ecBlocks: Any
    open fun getECCodewordsPerBlock(): Number
    open fun getNumBlocks(): Number
    open fun getTotalECCodewords(): Number
    open fun getECBlocks(): Array<ECB>
}