package com.jackiez.demoapp.login.dagger

import com.jackiez.demoapp.login.view.LoginFragment
import dagger.Component

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/13
 */
@Component
interface LoginComponent {

    fun inject(fragment: LoginFragment)
}