package cn.isning.zxingkmp

actual class BarcodeReader actual constructor(options : ReaderOptions) {
    actual fun read(imageView: ImageView): List<Barcode> {
        TODO("Not yet implemented")
    }
}

actual class ReaderOptions {
    actual var tryHarder: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var tryRotate: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var tryDownscale: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var tryInvert: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var isPure: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var returnErrors: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var binarizer: Binarizer
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var formats: Set<BarcodeFormat>
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var eanAddOnSymbol: EanAddOnSymbol
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var textMode: TextMode
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var minLineCount: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var maxNumberOfSymbols: Int
        get() = TODO("Not yet implemented")
        set(value) {}
}