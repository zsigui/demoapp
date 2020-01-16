package com.jackiez.demoapp.common.log

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/1
 */
object L {

    private const val DEFAULT_TAG = "DebugInfo"

    fun d(msg: String) {
        d(DEFAULT_TAG, msg)
    }

    fun d(tag: String, msg: String) {

    }

}