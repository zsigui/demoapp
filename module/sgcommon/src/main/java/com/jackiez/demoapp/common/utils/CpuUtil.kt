package com.jackiez.demoapp.common.utils

import android.os.Process
import java.io.File

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
object CpuUtil {

    @Volatile
    private var sCpuCount: Int = 0

    fun getCpuCount(): Int {
        if (sCpuCount != 0) {
            return sCpuCount
        }

        val cpuDir = File("/sys/devices/system/cpu")
        sCpuCount = if (cpuDir.isDirectory) {
            val filtered = cpuDir.list()?.filter {
                it.startsWith("cpu")
            }
            (filtered?.size ?: getAvailableCpuCount())
        } else {
            getAvailableCpuCount()
        }

        return sCpuCount
    }

    fun getAvailableCpuCount() = Runtime.getRuntime().availableProcessors()

}