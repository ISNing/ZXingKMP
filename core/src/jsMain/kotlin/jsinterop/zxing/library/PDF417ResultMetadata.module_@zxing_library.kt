@file:JsModule("@zxing/library")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.khronos.webgl.Int32Array

@JsName("PDF417ResultMetadata")
open external class PDF417ResultMetadata {
    open var segmentIndex: Any
    open var fileId: Any
    open var lastSegment: Any
    open var segmentCount: Any
    open var sender: Any
    open var addressee: Any
    open var fileName: Any
    open var fileSize: Any
    open var timestamp: Any
    open var checksum: Any
    open var optionalData: Any
    open fun getSegmentIndex(): Number
    open fun setSegmentIndex(segmentIndex: Number)
    open fun getFileId(): String
    open fun setFileId(fileId: String)
    open fun getOptionalData(): Int32Array
    open fun setOptionalData(optionalData: Int32Array)
    open fun isLastSegment(): Boolean
    open fun setLastSegment(lastSegment: Boolean)
    open fun getSegmentCount(): Number
    open fun setSegmentCount(segmentCount: Number)
    open fun getSender(): String
    open fun setSender(sender: String)
    open fun getAddressee(): String
    open fun setAddressee(addressee: String)
    open fun getFileName(): String
    open fun setFileName(fileName: String)
    open fun getFileSize(): Number
    open fun setFileSize(fileSize: Number)
    open fun getChecksum(): Number
    open fun setChecksum(checksum: Number)
    open fun getTimestamp(): Number
    open fun setTimestamp(timestamp: Number)
}