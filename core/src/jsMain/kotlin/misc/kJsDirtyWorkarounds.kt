package cn.isning.zxingkmp.misc

import org.khronos.webgl.Uint8ClampedArray

// Keep up with https://youtrack.jetbrains.com/issue/KT-24583
@OptIn(ExperimentalUnsignedTypes::class)
fun UByteArray.toUint8ClampedArray(): Uint8ClampedArray {
    val res = Uint8ClampedArray(size)
    forEachIndexed { index, byte -> res.asDynamic()[index] = byte.toInt() }
    return res
}
