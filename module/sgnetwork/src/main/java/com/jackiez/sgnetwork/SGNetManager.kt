package com.jackiez.sgnetwork

import android.content.Context
import com.jackiez.demoapp.common.SingletonHolder

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/23
 */
class SGNetManager private constructor(context: Context){

    companion object : SingletonHolder<SGNetManager, Context>(::SGNetManager)

}