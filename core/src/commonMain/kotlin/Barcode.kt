/*
* Copyright 2024 ISNing
*/
// SPDX-License-Identifier: Apache-2.0

package cn.isning.zxingkmp

data class Point(
    val x: Number,
    val y: Number
)

data class Position(
    val topLeft: Point,
    val topRight: Point,
    val bottomRight: Point,
    val bottomLeft: Point,
)

expect class Barcode {
    val isValid: Boolean
    val format: BarcodeFormat
    val bytes: ByteArray?
    val text: String?
    val ecLevel: String?
    val symbologyIdentifier: String?
    val position: Position
    val orientation: Int
}
