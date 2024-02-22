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
open external class FinderPattern(
    value: Number,
    startEnd: Array<Number>,
    start: Number,
    end: Number,
    rowNumber: Number
) {
    open var value: Any
    open var startEnd: Any
    open var resultPoints: Any
    open fun getValue(): Number
    open fun getStartEnd(): Array<Number>
    open fun getResultPoints(): Array<ResultPoint>
    override fun equals(o: Any?): Boolean
    override fun hashCode(): Number
}