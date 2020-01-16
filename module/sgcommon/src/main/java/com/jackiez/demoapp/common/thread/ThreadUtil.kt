package com.jackiez.demoapp.common.thread

import android.os.Handler
import android.os.Looper

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
object ThreadUtil {

    private val uiHandler = Handler(Looper.getMainLooper())

    fun post(runnable: Runnable) {
        uiHandler.post(runnable)
    }

    fun postDelay(runnable: Runnable, delayMillis: Long) {
        uiHandler.postDelayed(runnable, delayMillis)
    }

    fun postAtFront(runnable: Runnable) {
        uiHandler.postAtFrontOfQueue(runnable)
    }

    fun removeCallback(runnable: Runnable) {
        uiHandler.removeCallbacks(runnable)
    }

    fun removeMessage(what: Int) {
        uiHandler.removeMessages(what)
    }

    fun clear() {
        uiHandler.removeCallbacksAndMessages(null)
    }
}