package com.jackiez.demoapp

import android.content.Context
import com.jackiez.architecture.BaseApplication
import com.jackiez.demoapp.common.dagger.DaggerController
import com.jackiez.demoapp.common.dagger.DaggerGlobalComponent
import com.jackiez.demoapp.common.dagger.GlobalComponent
import com.jackiez.demoapp.common.utils.AppUtil

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/22
 */
class DemoApp : BaseApplication() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        AppUtil.init(this)
        DaggerController.get().appComponent.inject(this)

    }

    override fun onCreate() {
        super.onCreate()
    }
}