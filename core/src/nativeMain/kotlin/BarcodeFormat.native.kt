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

import zxingcpp.BarcodeFormat as RawBarcodeFormat

actual enum class BarcodeFormat(val raw: RawBarcodeFormat) {
    Aztec(RawBarcodeFormat.Aztec),
    Codabar(RawBarcodeFormat.Codabar),
    Code39(RawBarcodeFormat.Code39),
    Code93(RawBarcodeFormat.Code93),
    Code128(RawBarcodeFormat.Code128),
    DataBar(RawBarcodeFormat.DataBar),
    DataBarExpanded(RawBarcodeFormat.DataBarExpanded),
    DataMatrix(RawBarcodeFormat.DataMatrix),
    DXFilmEdge(RawBarcodeFormat.DXFilmEdge),
    EAN8(RawBarcodeFormat.EAN8),
    EAN13(RawBarcodeFormat.EAN13),
    ITF(RawBarcodeFormat.ITF),
    MaxiCode(RawBarcodeFormat.MaxiCode),
    PDF417(RawBarcodeFormat.PDF417),
    QRCode(RawBarcodeFormat.QRCode),
    MicroQrCode(RawBarcodeFormat.MicroQrCode),
    RMQRCode(RawBarcodeFormat.RMQRCode),
    UPCA(RawBarcodeFormat.UPCA),
    UPCE(RawBarcodeFormat.UPCE),
}

fun Iterable<RawBarcodeFormat>.toWrapped(): Set<BarcodeFormat> = map { it.toWrapped() }.toSet()

fun RawBarcodeFormat.toWrapped(): BarcodeFormat = BarcodeFormat.entries.first { it.raw == this }

val Set<BarcodeFormat>.raw get() = map { it.raw }.toSet()
