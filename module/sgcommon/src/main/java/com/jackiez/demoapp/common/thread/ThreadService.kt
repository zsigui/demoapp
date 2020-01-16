package com.jackiez.demoapp.common.thread

import com.jackiez.demoapp.common.utils.CpuUtil
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
class ThreadService private constructor(){

    companion object {
        val instance: ThreadService by lazy { ThreadService() }
    }

    private var ioExecutor: ThreadPoolExecutor
    private var networkExecutor: ThreadPoolExecutor
    private var backgroundExecutor: ThreadPoolExecutor
    private var imageExecutor: ThreadPoolExecutor

    init {
        val coreCpuSize = CpuUtil.getCpuCount()
        val abortPolicy = ThreadPoolExecutor.DiscardPolicy()
        ioExecutor = ThreadPoolExecutor(2, if (coreCpuSize > 2) coreCpuSize else 2, 60, TimeUnit.SECONDS,
            ArrayBlockingQueue(1024, true), NamedThreadFactory("IoThread-", Thread.NORM_PRIORITY - 1),
            abortPolicy)
        networkExecutor = ThreadPoolExecutor(coreCpuSize, coreCpuSize + 4,
            60, TimeUnit.SECONDS, LinkedBlockingDeque(9999),
            NamedThreadFactory("NetworkThread-", Thread.NORM_PRIORITY + 2),
            abortPolicy)
        backgroundExecutor = ThreadPoolExecutor(2, coreCpuSize, 60, TimeUnit.SECONDS,
            ArrayBlockingQueue(4096, false), NamedThreadFactory("BackgroundThread-", Thread.NORM_PRIORITY - 2),
            abortPolicy)
        imageExecutor = ThreadPoolExecutor(coreCpuSize, coreCpuSize,
            60, TimeUnit.SECONDS, LinkedBlockingDeque(9999),
            NamedThreadFactory("NetworkThread-", Thread.NORM_PRIORITY),
            abortPolicy)

    }
}