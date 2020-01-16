package com.jackiez.demoapp.common.utils

import androidx.annotation.*

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/22
 */
object ViewUtil {

    const val TYPE_STRING = "string"
    const val TYPE_COLOR = "color"
    const val TYPE_DRAWABLE = "drawable"
    const val TYPE_DIMENSION = "dimen"

    @Retention(AnnotationRetention.SOURCE)
    @StringDef(TYPE_COLOR, TYPE_STRING, TYPE_DRAWABLE, TYPE_DIMENSION)
    annotation class DEF_TYPE

    fun getString(@StringRes id: Int, vararg args: Any) = AppUtil.appContext.getString(id, args)

    fun getColor(@ColorRes id: Int) = AppUtil.appContext.resources.getColor(id)

    fun getDrawable(@DrawableRes id: Int) = AppUtil.appContext.resources.getDrawable(id)

    fun getColorStateList(@ColorRes id: Int) = AppUtil.appContext.resources.getColorStateList(id)

    fun getDimensionPixelSize(@DimenRes id: Int) = AppUtil.appContext.resources.getDimensionPixelSize(id)

    fun getDimension(@DimenRes id: Int) = AppUtil.appContext.resources.getDimension(id)

    fun getStringR(resName: String, vararg args: Any) = getString(getResId(resName, TYPE_STRING), args)

    fun getColorR(resName: String) = getColor(getResId(resName, TYPE_COLOR))

    fun getDrawableR(resName: String) = getString(getResId(resName, TYPE_DRAWABLE))

    fun getDimensionR(resName: String) = getDimension(getResId(resName, TYPE_DIMENSION))

    fun getResId(resName: String, @DEF_TYPE defType: String) = AppUtil.appContext.resources.getIdentifier(resName, defType, AppUtil.appContext.packageName)
}