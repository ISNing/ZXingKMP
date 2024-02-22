@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.HTMLVideoElement
import org.w3c.dom.events.EventListener
import org.w3c.dom.mediacapture.MediaDeviceInfo
import org.w3c.dom.mediacapture.MediaStream
import org.w3c.dom.mediacapture.MediaStreamConstraints
import kotlin.js.Promise

external interface `T$0` {
    var sx: Number
    var sy: Number
    var sWidth: Number
    var sHeight: Number
    var dx: Number
    var dy: Number
    var dWidth: Number
    var dHeight: Number
}

open external class BrowserCodeReader(
    reader: Reader,
    timeBetweenScansMillis: Number = definedExternally,
    _hints: Map<DecodeHintType, Any> = definedExternally
) {
    open var reader: Any
    open var timeBetweenScansMillis: Number
    open var _hints: Map<DecodeHintType, Any>
    open var _stopContinuousDecode: Any
    open var _stopAsyncDecode: Any
    open var _timeBetweenDecodingAttempts: Number
    open var captureCanvas: HTMLCanvasElement
    open var captureCanvasContext: CanvasRenderingContext2D
    open var imageElement: HTMLImageElement
    open var imageLoadedListener: EventListener
    open var stream: MediaStream
    open var videoElement: HTMLVideoElement
    open var videoCanPlayListener: EventListener
    open var videoEndedListener: EventListener
    open var videoPlayingEventListener: EventListener
    open fun listVideoInputDevices(): Promise<Array<MediaDeviceInfo>>
    open fun getVideoInputDevices(): Promise<Array<VideoInputDevice>>
    open fun findDeviceById(deviceId: String): Promise<MediaDeviceInfo>
    open fun decodeFromInputVideoDevice(
        deviceId: String = definedExternally,
        videoSource: String = definedExternally
    ): Promise<Result>

    open fun decodeFromInputVideoDevice(): Promise<Result>
    open fun decodeFromInputVideoDevice(deviceId: String = definedExternally): Promise<Result>
    open fun decodeFromInputVideoDevice(
        deviceId: String = definedExternally,
        videoSource: HTMLVideoElement = definedExternally
    ): Promise<Result>

    open fun decodeOnceFromVideoDevice(
        deviceId: String = definedExternally,
        videoSource: String = definedExternally
    ): Promise<Result>

    open fun decodeOnceFromVideoDevice(): Promise<Result>
    open fun decodeOnceFromVideoDevice(deviceId: String = definedExternally): Promise<Result>
    open fun decodeOnceFromVideoDevice(
        deviceId: String = definedExternally,
        videoSource: HTMLVideoElement = definedExternally
    ): Promise<Result>

    open fun decodeOnceFromConstraints(
        constraints: MediaStreamConstraints,
        videoSource: String = definedExternally
    ): Promise<Result>

    open fun decodeOnceFromConstraints(constraints: MediaStreamConstraints): Promise<Result>
    open fun decodeOnceFromConstraints(
        constraints: MediaStreamConstraints,
        videoSource: HTMLVideoElement = definedExternally
    ): Promise<Result>

    open fun decodeOnceFromStream(stream: MediaStream, videoSource: String = definedExternally): Promise<Result>
    open fun decodeOnceFromStream(stream: MediaStream): Promise<Result>
    open fun decodeOnceFromStream(
        stream: MediaStream,
        videoSource: HTMLVideoElement = definedExternally
    ): Promise<Result>

    open fun decodeFromInputVideoDeviceContinuously(
        deviceId: String?,
        videoSource: String?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromInputVideoDeviceContinuously(
        deviceId: String?,
        videoSource: HTMLVideoElement?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromVideoDevice(
        deviceId: String?,
        videoSource: String?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromVideoDevice(
        deviceId: String?,
        videoSource: HTMLVideoElement?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromConstraints(
        constraints: MediaStreamConstraints,
        videoSource: String,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromConstraints(
        constraints: MediaStreamConstraints,
        videoSource: HTMLVideoElement,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromStream(
        stream: MediaStream,
        videoSource: String,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromStream(
        stream: MediaStream,
        videoSource: HTMLVideoElement,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun stopAsyncDecode()
    open fun stopContinuousDecode()
    open fun attachStreamToVideo(stream: MediaStream, videoSource: String): Promise<HTMLVideoElement>
    open fun attachStreamToVideo(stream: MediaStream, videoSource: HTMLVideoElement): Promise<HTMLVideoElement>
    open fun playVideoOnLoadAsync(videoElement: HTMLVideoElement): Promise<Unit>
    open fun playVideoOnLoad(element: HTMLVideoElement, callbackFn: EventListener)
    open fun isVideoPlaying(video: HTMLVideoElement): Boolean
    open fun tryPlayVideo(videoElement: HTMLVideoElement): Promise<Unit>
    open fun getMediaElement(mediaElementId: String, type: String): dynamic /* HTMLVideoElement | HTMLImageElement */
    open fun decodeFromImage(source: String = definedExternally, url: String = definedExternally): Promise<Result>
    open fun decodeFromImage(): Promise<Result>
    open fun decodeFromImage(source: String = definedExternally): Promise<Result>
    open fun decodeFromImage(
        source: HTMLImageElement = definedExternally,
        url: String = definedExternally
    ): Promise<Result>

    open fun decodeFromImage(source: HTMLImageElement = definedExternally): Promise<Result>
    open fun decodeFromVideo(source: String = definedExternally, url: String = definedExternally): Promise<Result>
    open fun decodeFromVideo(): Promise<Result>
    open fun decodeFromVideo(source: String = definedExternally): Promise<Result>
    open fun decodeFromVideo(
        source: HTMLVideoElement = definedExternally,
        url: String = definedExternally
    ): Promise<Result>

    open fun decodeFromVideo(source: HTMLVideoElement = definedExternally): Promise<Result>
    open fun decodeFromVideoContinuously(
        source: String?,
        url: String?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromVideoContinuously(
        source: HTMLVideoElement?,
        url: String?,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open fun decodeFromImageElement(source: String): Promise<Result>
    open fun decodeFromImageElement(source: HTMLImageElement): Promise<Result>
    open fun decodeFromVideoElement(source: String): Promise<Result>
    open fun decodeFromVideoElement(source: HTMLVideoElement): Promise<Result>
    open fun decodeFromVideoElementContinuously(source: String, callbackFn: DecodeContinuouslyCallback): Promise<Unit>
    open fun decodeFromVideoElementContinuously(
        source: HTMLVideoElement,
        callbackFn: DecodeContinuouslyCallback
    ): Promise<Unit>

    open var _decodeFromVideoElementSetup: Any
    open fun decodeFromImageUrl(url: String = definedExternally): Promise<Result>
    open fun decodeFromVideoUrl(url: String): Promise<Result>
    open fun decodeFromVideoUrlContinuously(url: String, callbackFn: DecodeContinuouslyCallback): Promise<Unit>
    open var _decodeOnLoadImage: Any
    open var _decodeOnLoadVideo: Any
    open var _decodeOnLoadVideoContinuously: Any
    open fun isImageLoaded(img: HTMLImageElement): Boolean
    open fun prepareImageElement(imageSource: HTMLImageElement = definedExternally): HTMLImageElement
    open fun prepareImageElement(): HTMLImageElement
    open fun prepareImageElement(imageSource: String = definedExternally): HTMLImageElement
    open fun prepareVideoElement(videoSource: HTMLVideoElement = definedExternally): HTMLVideoElement
    open fun prepareVideoElement(): HTMLVideoElement
    open fun prepareVideoElement(videoSource: String = definedExternally): HTMLVideoElement
    open fun decodeOnce(
        element: HTMLVideoElement,
        retryIfNotFound: Boolean = definedExternally,
        retryIfChecksumOrFormatError: Boolean = definedExternally
    ): Promise<Result>

    open fun decodeOnce(element: HTMLVideoElement): Promise<Result>
    open fun decodeOnce(element: HTMLVideoElement, retryIfNotFound: Boolean = definedExternally): Promise<Result>
    open fun decodeOnce(
        element: HTMLImageElement,
        retryIfNotFound: Boolean = definedExternally,
        retryIfChecksumOrFormatError: Boolean = definedExternally
    ): Promise<Result>

    open fun decodeOnce(element: HTMLImageElement): Promise<Result>
    open fun decodeOnce(element: HTMLImageElement, retryIfNotFound: Boolean = definedExternally): Promise<Result>
    open fun decodeContinuously(element: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback)
    open fun decode(element: HTMLVideoElement): Result
    open fun decode(element: HTMLImageElement): Result
    open fun createBinaryBitmap(mediaElement: HTMLVideoElement): BinaryBitmap
    open fun createBinaryBitmap(mediaElement: HTMLImageElement): BinaryBitmap
    open fun getCaptureCanvasContext(mediaElement: HTMLVideoElement = definedExternally): CanvasRenderingContext2D
    open fun getCaptureCanvasContext(): CanvasRenderingContext2D
    open fun getCaptureCanvasContext(mediaElement: HTMLImageElement = definedExternally): CanvasRenderingContext2D
    open fun getCaptureCanvas(mediaElement: HTMLVideoElement = definedExternally): HTMLCanvasElement
    open fun getCaptureCanvas(): HTMLCanvasElement
    open fun getCaptureCanvas(mediaElement: HTMLImageElement = definedExternally): HTMLCanvasElement
    open fun drawFrameOnCanvas(
        srcElement: HTMLVideoElement,
        dimensions: `T$0` = definedExternally,
        canvasElementContext: CanvasRenderingContext2D = definedExternally
    )

    open fun drawImageOnCanvas(
        srcElement: HTMLImageElement,
        dimensions: `T$0` = definedExternally,
        canvasElementContext: CanvasRenderingContext2D = definedExternally
    )

    open fun decodeBitmap(binaryBitmap: BinaryBitmap): Result
    open fun createCaptureCanvas(mediaElement: HTMLVideoElement = definedExternally): HTMLCanvasElement
    open fun createCaptureCanvas(): HTMLCanvasElement
    open fun createCaptureCanvas(mediaElement: HTMLImageElement = definedExternally): HTMLCanvasElement
    open fun stopStreams()
    open fun reset()
    open var _destroyVideoElement: Any
    open var _destroyImageElement: Any
    open var _destroyCaptureCanvas: Any
    open fun addVideoSource(videoElement: HTMLVideoElement, stream: MediaStream)
    open var cleanVideoSource: Any
}