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

import cn.isning.zxingkmp.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class BarcodeReaderTest {

    @Test
    fun readBarcode() {
        val data = "0000101000101101011110111101011011101010100111011100101000100101110010100000".map {
            if (it == '0') 255.toByte() else 0.toByte()
        }

        val iv = ImageView(data.toByteArray(), data.size, 1, ImageFormat.Lum)
        val br = BarcodeReader(ReaderOptions().apply { binarizer = BoolCastBinarizer })
        val res = br.read(iv).firstOrNull()

        val expected = "96385074"

        assertNotNull(res)
        assertTrue(res.isValid)
        assertEquals(BarcodeFormat.EAN8, res.format)
        assertEquals(expected, res.text)
//        assertContentEquals(expected.encodeToByteArray(), res.bytes) TODO: Seems zxing java/js does not provide bytes: https://github.com/ISNing/ZXingKMP/issues/11
        assertEquals(0, res.orientation)
//        assertEquals(Point(4, 0), res.position.topLeft) TODO: JVM and Native have different behavior: https://github.com/ISNing/ZXingKMP/issues/12
    }
}
