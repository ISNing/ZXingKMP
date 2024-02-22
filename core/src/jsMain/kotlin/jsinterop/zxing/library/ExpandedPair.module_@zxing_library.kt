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
open external class ExpandedPair(
    leftChar: DataCharacter,
    rightChar: DataCharacter,
    finderPatter: FinderPattern,
    mayBeLast: Boolean
) {
    open var maybeLast: Any
    open var leftchar: Any
    open var rightchar: Any
    open var finderpattern: Any
    open fun mayBeLast(): Boolean
    open fun getLeftChar(): DataCharacter
    open fun getRightChar(): DataCharacter
    open fun getFinderPattern(): FinderPattern
    open fun mustBeLast(): Boolean
    override fun toString(): String
    override fun hashCode(): Any

    companion object {
        fun equals(o1: Any, o2: Any): Boolean
        var equalsOrNull: Any
    }
}