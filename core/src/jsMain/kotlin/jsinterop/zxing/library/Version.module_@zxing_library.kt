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
open external class Version {
    open var versionNumber: Any
    open var alignmentPatternCenters: Any
    open var ecBlocks: Any
    open var totalCodewords: Any
    open fun getVersionNumber(): Number
    open fun getAlignmentPatternCenters(): Int32Array
    open fun getTotalCodewords(): Number
    open fun getDimensionForVersion(): Number
    open fun getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks
    open fun buildFunctionPattern(): BitMatrix
    override fun toString(): String

    companion object {
        var VERSION_DECODE_INFO: Any
        var VERSIONS: Any
        fun getProvisionalVersionForDimension(dimension: Number): Version
        fun getVersionForNumber(versionNumber: Number): Version
        fun decodeVersionInformation(versionBits: Number): Version
    }
}