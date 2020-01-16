package com.jackiez.demoapp.common.utils

import android.widget.Toast
import androidx.annotation.StringRes

object ToastUtil {

    fun showS(msg: String) {
        Toast.makeText(AppUtil.appContext, msg, Toast.LENGTH_SHORT).show()
    }

    fun showL(msg: String) {
        Toast.makeText(AppUtil.appContext, msg, Toast.LENGTH_LONG).show()
    }

    fun showS(@StringRes msg: Int) {
        Toast.makeText(AppUtil.appContext, msg, Toast.LENGTH_SHORT).show()
    }

    fun showL(@StringRes msg: Int) {
        Toast.makeText(AppUtil.appContext, msg, Toast.LENGTH_LONG).show()
    }
}