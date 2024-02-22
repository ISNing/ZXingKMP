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
open external class DefaultPlacement(codewords: String, numcols: Number, numrows: Number) {
    open var codewords: Any
    open var numcols: Any
    open var numrows: Any
    open var bits: Any
    open fun getNumrows(): Number
    open fun getNumcols(): Number
    open fun getBits(): Uint8Array
    open fun getBit(col: Number, row: Number): Boolean
    open var setBit: Any
    open var noBit: Any
    open fun place()
    open var module: Any
    open var utah: Any
    open var corner1: Any
    open var corner2: Any
    open var corner3: Any
    open var corner4: Any
}