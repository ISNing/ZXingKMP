@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class BarcodeFormat {
    AZTEC /* = 0 */,
    CODABAR /* = 1 */,
    CODE_39 /* = 2 */,
    CODE_93 /* = 3 */,
    CODE_128 /* = 4 */,
    DATA_MATRIX /* = 5 */,
    EAN_8 /* = 6 */,
    EAN_13 /* = 7 */,
    ITF /* = 8 */,
    MAXICODE /* = 9 */,
    PDF_417 /* = 10 */,
    QR_CODE /* = 11 */,
    RSS_14 /* = 12 */,
    RSS_EXPANDED /* = 13 */,
    UPC_A /* = 14 */,
    UPC_E /* = 15 */,
    UPC_EAN_EXTENSION /* = 16 */
}