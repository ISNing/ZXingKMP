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

import com.google.zxing.Result
import com.google.zxing.ResultMetadataType
import com.google.zxing.ResultPoint

actual class Barcode(private val raw: Result, private val eanAddOnSymbol: EanAddOnSymbol) {
    actual val isValid: Boolean = true
    actual val format: BarcodeFormat by lazy { raw.barcodeFormat.toWrapped() }
    actual val bytes: ByteArray?
        get() = raw.rawBytes
    actual val text: String? by lazy {
        when (eanAddOnSymbol) {
            EanAddOnSymbol.Ignore -> raw.text
            EanAddOnSymbol.Read, EanAddOnSymbol.Require -> raw.resultMetadata[ResultMetadataType.UPC_EAN_EXTENSION]
                ?.toString()?.let { "${raw.text}+$it" } ?: raw.text
        }
    }
    actual val ecLevel: String?
        get() = raw.resultMetadata[ResultMetadataType.ERROR_CORRECTION_LEVEL] as? String
    actual val symbologyIdentifier: String?
        get() = raw.resultMetadata[ResultMetadataType.SYMBOLOGY_IDENTIFIER] as? String
    actual val position: Position by lazy { raw.resultPoints.toWrapped() }
    actual val orientation: Int
        get() = raw.resultMetadata[ResultMetadataType.ORIENTATION] as? Int ?: position.orientation
}

fun Result.toWrapped(eanAddOnSymbol: EanAddOnSymbol): Barcode = Barcode(this, eanAddOnSymbol)

fun ResultPoint.toWrapped(): Point = Point((x - 0.5).toInt(), (y - 0.5).toInt())

fun Array<ResultPoint>.toWrapped(): Position = when (size) {
    2 -> Position(
        topLeft = this[0].toWrapped(),
        topRight = this[1].toWrapped()
    )

    3 -> Position(
        bottomLeft = this[0].toWrapped(),
        topLeft = this[1].toWrapped(),
        topRight = this[2].toWrapped()
    )

    4 -> Position(
        bottomLeft = this[0].toWrapped(),
        topLeft = this[1].toWrapped(),
        topRight = this[2].toWrapped(),
        bottomRight = this[3].toWrapped()
    )

    else -> error("Unsupported number of points: $size, report this to the library maintainers at github")
}
