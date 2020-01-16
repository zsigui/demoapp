package com.jackiez.demoapp.common.dagger

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/4
 */
class DaggerController private constructor(){

    companion object {
        private val instance by lazy { DaggerController() }

        fun get() = instance
    }

    val appComponent = DaggerGlobalComponent.create()
}