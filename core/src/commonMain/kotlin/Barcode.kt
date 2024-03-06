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

import cn.isning.zxingkmp.misc.toDegree
import kotlin.math.atan

data class Point(
    val x: Int,
    val y: Int
) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    operator fun minus(other: Point) = Point(x - other.x, y - other.y)
}

data class Position(
    val topLeft: Point,
    val topRight: Point,
    val bottomRight: Point,
    val bottomLeft: Point,
) {
    constructor(topLeft: Point, topRight: Point) : this(
        topLeft = topLeft,
        topRight = topRight,
        bottomRight = topRight,
        bottomLeft = topLeft
    )
    constructor(topLeft: Point, topRight: Point, bottomLeft: Point) : this(
        topLeft = topLeft,
        topRight = topRight,
        bottomRight = bottomLeft + (topRight - topLeft), // Predicted (Not precise)
        bottomLeft = bottomLeft
    )
    val orientation: Int by lazy {
        val delta = topRight - topLeft
        when {
            delta.x == 0 -> if (delta.y > 0) 90 else 270
            delta.y == 0 -> if (delta.x > 0) 0 else 180
            else -> atan(delta.y.toDouble() / delta.x.toDouble()).toDegree().toInt()
        }
    }
}

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
