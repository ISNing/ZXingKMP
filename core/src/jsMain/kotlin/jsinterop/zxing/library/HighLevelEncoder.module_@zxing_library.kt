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
open external class HighLevelEncoder(text: Uint8Array) {
    open var text: Any
    open fun encode(): BitArray
    open var updateStateListForChar: Any
    open var updateStateForChar: Any

    companion object {
        var updateStateListForPair: Any
        var updateStateForPair: Any
        var simplifyStates: Any
    }
}