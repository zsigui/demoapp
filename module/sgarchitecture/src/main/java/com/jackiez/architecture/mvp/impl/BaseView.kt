package com.jackiez.architecture.mvp.impl

import androidx.lifecycle.*
import com.jackiez.architecture.mvp.itf.IBaseView

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/29
 */
abstract class BaseView : IBaseView {
    var owner: LifecycleOwner? = null

    constructor(lifecycleOwner: LifecycleOwner?) {
        owner = lifecycleOwner

        owner?.lifecycle?.addObserver(this)
    }

    override fun onDestroy() {
        owner?.lifecycle?.removeObserver(this)
    }

    fun getLifeState() = owner?.lifecycle?.currentState

}