package com.jackiez.demoapp.common.exception

import com.jackiez.demoapp.common.log.L

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
class ThreadUncaughtExceptionHandler private constructor()
    : Thread.UncaughtExceptionHandler {

    companion object {
        const val TAG = "ThreadUncaughtExceptionHandler"
        private val instance: ThreadUncaughtExceptionHandler by lazy { ThreadUncaughtExceptionHandler() }
        fun get() = instance
    }

    override fun uncaughtException(t: Thread, e: Throwable) {
        val defaultHandler = Thread.getDefaultUncaughtExceptionHandler()
        if (handle(t, e)) {
            L.d(TAG, "throw is handled by ThreadHandler! thread name is " + t.name)
            //
            reportInfo(t, e)
        } else {
            defaultHandler?.uncaughtException(t, e)
        }
    }

    private fun handle(t: Thread, e: Throwable): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun reportInfo(t: Thread, e: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}