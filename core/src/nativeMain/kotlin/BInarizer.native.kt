package cn.isning.zxingkmp

import zxingcpp.Binarizer as RawBinarizer

// This is not intended to be initialized directly, use the actual objects
actual interface Binarizer {
    val raw: RawBinarizer
}

open class WrappedRawBinarizer(override val raw: RawBinarizer) : Binarizer

actual object GlobalHistogramBinarizer : WrappedRawBinarizer(RawBinarizer.GlobalHistogram), Binarizer
actual object HybridBinarizer : WrappedRawBinarizer(RawBinarizer.LocalAverage), Binarizer

object BoolCastBinarizer : WrappedRawBinarizer(RawBinarizer.BoolCast), Binarizer
object FixedThresholdBinarizer : WrappedRawBinarizer(RawBinarizer.FixedThreshold), Binarizer

fun RawBinarizer.toWrapped(): Binarizer = when (this) {
    RawBinarizer.GlobalHistogram -> GlobalHistogramBinarizer
    RawBinarizer.LocalAverage -> HybridBinarizer
    RawBinarizer.BoolCast -> BoolCastBinarizer
    RawBinarizer.FixedThreshold -> FixedThresholdBinarizer
    else -> throw IllegalArgumentException("Unknown Binarizer type")
}