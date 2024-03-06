@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class ResultMetadataType {
    OTHER /* = 0 */,
    ORIENTATION /* = 1 */,
    BYTE_SEGMENTS /* = 2 */,
    ERROR_CORRECTION_LEVEL /* = 3 */,
    ISSUE_NUMBER /* = 4 */,
    SUGGESTED_PRICE /* = 5 */,
    POSSIBLE_COUNTRY /* = 6 */,
    UPC_EAN_EXTENSION /* = 7 */,
    PDF417_EXTRA_METADATA /* = 8 */,
    STRUCTURED_APPEND_SEQUENCE /* = 9 */,
    STRUCTURED_APPEND_PARITY /* = 10 */
}