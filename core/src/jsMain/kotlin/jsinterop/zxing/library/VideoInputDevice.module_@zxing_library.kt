@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package cn.isning.zxingkmp.jsinterop.zxing.library

import org.w3c.dom.mediacapture.MediaDeviceInfo

open external class VideoInputDevice(deviceId: String, label: String, groupId: String = definedExternally) :
    MediaDeviceInfo {
    override var deviceId: String
    override var label: String
    override var groupId: String
    override fun toJSON(): dynamic
}