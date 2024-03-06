@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

@JsName("SymbolInfo")
open external class SymbolInfo(
    rectangular: Boolean,
    dataCapacity: Number,
    errorCodewords: Number,
    matrixWidth: Number,
    matrixHeight: Number,
    dataRegions: Number,
    rsBlockData: Number = definedExternally,
    rsBlockError: Number = definedExternally
) {
    open var rectangular: Any
    open var dataCapacity: Any
    open var errorCodewords: Any
    open var matrixWidth: Number
    open var matrixHeight: Number
    open var dataRegions: Any
    open var rsBlockData: Any
    open var rsBlockError: Any
    open var getHorizontalDataRegions: Any
    open var getVerticalDataRegions: Any
    open fun getSymbolDataWidth(): Number
    open fun getSymbolDataHeight(): Number
    open fun getSymbolWidth(): Number
    open fun getSymbolHeight(): Number
    open fun getCodewordCount(): Number
    open fun getInterleavedBlockCount(): Number
    open fun getDataCapacity(): Number
    open fun getErrorCodewords(): Number
    open fun getDataLengthForInterleavedBlock(index: Number): Number
    open fun getErrorLengthForInterleavedBlock(index: Number): Number

    companion object {
        fun lookup(
            dataCodewords: Number,
            shape: SymbolShapeHint = definedExternally,
            minSize: Dimension = definedExternally,
            maxSize: Dimension = definedExternally,
            fail: Boolean = definedExternally
        ): SymbolInfo
    }
}