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

expect class BarcodeReader(options: ReaderOptions = ReaderOptions()) {
    @Throws(BarcodeReadingException::class)
    fun read(imageView: ImageView): List<Barcode>
}

class BarcodeReadingException(message: String?, cause: Throwable? = null) :
    Exception("Failed to read barcodes: $message", cause)


expect class ReaderOptions() {
    var tryHarder: Boolean
    var tryInvert: Boolean
    var isPure: Boolean
    var binarizer: Binarizer
    var formats: Set<BarcodeFormat>
    var eanAddOnSymbol: EanAddOnSymbol
    var maxNumberOfSymbols: Int
}

expect enum class EanAddOnSymbol {
    Ignore,
    Read,
    Require,
}
