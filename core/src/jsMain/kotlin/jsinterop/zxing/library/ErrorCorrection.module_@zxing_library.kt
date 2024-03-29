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

@JsName("ErrorCorrection")
open external class ErrorCorrection {
    open var field: Any
    open fun decode(received: Int32Array, numECCodewords: int, erasures: Int32Array): int
    open var runEuclideanAlgorithm: Any
    open var findErrorLocations: Any
    open var findErrorMagnitudes: Any
}