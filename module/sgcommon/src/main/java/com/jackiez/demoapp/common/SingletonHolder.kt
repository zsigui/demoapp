package com.jackiez.demoapp.common

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/23
 */
open class SingletonHolder<out T, in A>(pCreator: (A) -> T) {

    private var creator: ((A) -> T)? = pCreator

    @Volatile
    private var instance: T? = null

    fun getInstance(args: A): T {
        val i = instance
        if (i != null) {
            return i
        }

        return synchronized(this) {
            val i2 = instance
            if (i2 != null) {
                i2
            } else {
                val created = creator!!(args)
                instance = created
                creator = null
                created
            }
        }
    }
}