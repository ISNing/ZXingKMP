/*
 * Copyright 2024 ISNing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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