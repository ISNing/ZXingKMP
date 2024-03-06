@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("AztecCode")
open external class AztecCode {
    open var compact: Any
    open var size: Any
    open var layers: Any
    open var codeWords: Any
    open var matrix: Any
    open fun isCompact(): Boolean
    open fun setCompact(compact: Boolean)
    open fun getSize(): int
    open fun setSize(size: int)
    open fun getLayers(): int
    open fun setLayers(layers: int)
    open fun getCodeWords(): int
    open fun setCodeWords(codeWords: int)
    open fun getMatrix(): BitMatrix
    open fun setMatrix(matrix: BitMatrix)
}