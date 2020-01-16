package com.jackiez.demoapp.common.utils

import android.app.Application
import android.content.Context

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/22
 */
object AppUtil {

    lateinit var appContext: Context
    lateinit var appInstance: Application

    fun init(app: Application) {
        appContext = app.applicationContext
        appInstance = app
    }


}