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

@JsName("default")
open external class MathUtils {
    companion object {
        fun round(d: Number): Number
        fun distance(aX: Number, aY: Number, bX: Number, bY: Number): Number
        fun sum(array: Int32Array): Number
    }
}