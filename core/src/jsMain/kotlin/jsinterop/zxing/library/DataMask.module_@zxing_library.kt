@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class DataMaskValues {
    DATA_MASK_000 /* = 0 */,
    DATA_MASK_001 /* = 1 */,
    DATA_MASK_010 /* = 2 */,
    DATA_MASK_011 /* = 3 */,
    DATA_MASK_100 /* = 4 */,
    DATA_MASK_101 /* = 5 */,
    DATA_MASK_110 /* = 6 */,
    DATA_MASK_111 /* = 7 */
}

@JsName("DataMask")
open external class DataMask(value: DataMaskValues, isMasked: (i: Number, j: Number) -> Boolean) {
    open var value: Any
    open var isMasked: Any
    open fun unmaskBitMatrix(bits: BitMatrix, dimension: Number)

    companion object {
        var values: Map<DataMaskValues, DataMask>
    }
}