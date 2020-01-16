package com.jackiez.demoapp.login.model

import androidx.annotation.IntDef
import javax.inject.Inject

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/13
 */
class LoginInfo {

    companion object {
        const val TYPE_PWD = 0
        const val TYPE_QQ = 1
        const val TYPE_WX = 2
        const val TYPE_PHONE = 3
    }

    @Inject
    constructor()

    var username: String? = null
    var password: String? = null
    var phone: String? = null
    @LoginType
    var loginType: Int = TYPE_PWD

    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @IntDef(TYPE_PWD, TYPE_QQ, TYPE_WX, TYPE_PHONE)
    annotation class LoginType
}