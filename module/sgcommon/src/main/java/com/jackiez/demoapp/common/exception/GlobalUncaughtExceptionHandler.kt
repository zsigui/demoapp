package com.jackiez.demoapp.common.exception

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
class GlobalUncaughtExceptionHandler : Thread.UncaughtExceptionHandler {

    private val defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()

    override fun uncaughtException(t: Thread, e: Throwable) {
        if (!handle(t, e)) {
            defaultExceptionHandler?.uncaughtException(t, e)
        }
    }

    private fun handle(t: Thread, e: Throwable): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}