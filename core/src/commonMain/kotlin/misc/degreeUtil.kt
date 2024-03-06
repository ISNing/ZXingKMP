package cn.isning.zxingkmp.misc

import kotlin.math.PI


typealias Degree = Double
typealias Radian = Double

fun Degree.toRadian(): Radian = this / 180 * PI
fun Radian.toDegree(): Degree = this * 180 / PI

