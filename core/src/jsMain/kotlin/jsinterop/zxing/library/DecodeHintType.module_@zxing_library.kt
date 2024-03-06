@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class DecodeHintType {
    OTHER /* = 0 */,
    PURE_BARCODE /* = 1 */,
    POSSIBLE_FORMATS /* = 2 */,
    TRY_HARDER /* = 3 */,
    CHARACTER_SET /* = 4 */,
    ALLOWED_LENGTHS /* = 5 */,
    ASSUME_CODE_39_CHECK_DIGIT /* = 6 */,
    ASSUME_GS1 /* = 7 */,
    RETURN_CODABAR_START_END /* = 8 */,
    NEED_RESULT_POINT_CALLBACK /* = 9 */,
    ALLOWED_EAN_EXTENSIONS /* = 10 */
}