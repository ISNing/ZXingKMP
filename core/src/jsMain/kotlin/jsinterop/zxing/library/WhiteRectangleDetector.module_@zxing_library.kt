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
open external class WhiteRectangleDetector(
    image: BitMatrix,
    initSize: Number = definedExternally,
    x: Number = definedExternally,
    y: Number = definedExternally
) {
    open var image: Any
    open var height: Any
    open var width: Any
    open var leftInit: Any
    open var rightInit: Any
    open var downInit: Any
    open var upInit: Any
    open fun detect(): Array<ResultPoint>
    open var getBlackPointOnSegment: Any
    open var centerEdges: Any
    open var containsBlackPoint: Any

    companion object {
        var INIT_SIZE: Any
        var CORR: Any
    }
}