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
open external class ReedSolomonEncoder(field: GenericGF) {
    open var field: Any
    open var cachedGenerators: Any
    open var buildGenerator: Any
    open fun encode(toEncode: Int32Array, ecBytes: Number)
}