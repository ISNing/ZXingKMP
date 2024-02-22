@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.w3c.dom.HTMLElement
import org.w3c.dom.svg.SVGSVGElement

open external class BrowserQRCodeSvgWriter {
    open fun write(
        contents: String,
        width: Number,
        height: Number,
        hints: Map<EncodeHintType, Any> = definedExternally
    ): SVGSVGElement

    open fun writeToDom(
        containerElement: String,
        contents: String,
        width: Number,
        height: Number,
        hints: Map<EncodeHintType, Any> = definedExternally
    )

    open fun writeToDom(containerElement: String, contents: String, width: Number, height: Number)
    open fun writeToDom(
        containerElement: HTMLElement,
        contents: String,
        width: Number,
        height: Number,
        hints: Map<EncodeHintType, Any> = definedExternally
    )

    open fun writeToDom(containerElement: HTMLElement, contents: String, width: Number, height: Number)
    open var renderResult: Any
    open var createSVGElement: Any
    open var createSvgRectElement: Any

    companion object {
        var QUIET_ZONE_SIZE: Any
        var SVG_NS: Any
    }
}