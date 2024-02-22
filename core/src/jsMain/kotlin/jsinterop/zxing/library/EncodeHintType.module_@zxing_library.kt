@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

external enum class EncodeHintType {
    ERROR_CORRECTION /* = 0 */,
    CHARACTER_SET /* = 1 */,
    DATA_MATRIX_SHAPE /* = 2 */,
    DATA_MATRIX_COMPACT /* = 3 */,
    MIN_SIZE /* = 4 */,
    MAX_SIZE /* = 5 */,
    MARGIN /* = 6 */,
    PDF417_COMPACT /* = 7 */,
    PDF417_COMPACTION /* = 8 */,
    PDF417_DIMENSIONS /* = 9 */,
    AZTEC_LAYERS /* = 10 */,
    QR_VERSION /* = 11 */,
    GS1_FORMAT /* = 12 */,
    FORCE_C40 /* = 13 */
}