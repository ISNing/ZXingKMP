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
open external class ResultPoint(x: float, y: float) {
    open var x: Any
    open var y: Any
    open fun getX(): float
    open fun getY(): float
    override fun equals(other: Any?): Boolean
    override fun hashCode(): int
    override fun toString(): String

    companion object {
        fun orderBestPatterns(patterns: Array<ResultPoint>)
        fun distance(pattern1: ResultPoint, pattern2: ResultPoint): float
        var crossProductZ: Any
    }
}