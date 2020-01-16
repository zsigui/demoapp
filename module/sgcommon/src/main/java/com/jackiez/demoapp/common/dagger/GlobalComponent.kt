package com.jackiez.demoapp.common.dagger

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjector

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/4
 */
@Component(modules = [AppModule::class])
interface GlobalComponent : AndroidInjector<Application> {

    fun inject()
}