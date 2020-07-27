package com.skfo763.rtc.manager

import org.webrtc.VideoCapturer

interface VideoCaptureManager {

    val videoCapturer: VideoCapturer?

    fun stopVideoCapture(doOnError: ((e: Exception) -> Unit)? = null)

}