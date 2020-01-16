package com.jackiez.demoapp.common.thread

import com.jackiez.demoapp.common.exception.ThreadUncaughtExceptionHandler
import java.util.concurrent.ThreadFactory

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
class NamedThreadFactory(private val prefix: String, private val priority: Int) : ThreadFactory {

    private var newCount = 0

    override fun newThread(r: Runnable): Thread  {
        val thread = Thread(null, r, prefix + newCount++)
        thread.uncaughtExceptionHandler = ThreadUncaughtExceptionHandler.get()
        thread.priority = priority
        return thread
    }
}