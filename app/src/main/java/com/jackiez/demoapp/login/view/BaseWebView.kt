package com.jackiez.demoapp.login.view

import android.content.Context
import android.webkit.*

/**
 * Description :
 * Author : jackizez
 * Date : 2019/11/13
 */
class BaseWebView(context: Context?) : WebView(context) {

    fun setUrl () {
        webChromeClient = object : WebChromeClient() {

            override fun onJsAlert(
                view: WebView?,
                url: String?,
                message: String?,
                result: JsResult?
            ): Boolean {
                return super.onJsAlert(view, url, message, result)
            }

            override fun onJsConfirm(
                view: WebView?,
                url: String?,
                message: String?,
                result: JsResult?
            ): Boolean {
                return super.onJsConfirm(view, url, message, result)
            }

            override fun onJsBeforeUnload(
                view: WebView?,
                url: String?,
                message: String?,
                result: JsResult?
            ): Boolean {
                return super.onJsBeforeUnload(view, url, message, result)
            }

            override fun onJsPrompt(
                view: WebView?,
                url: String?,
                message: String?,
                defaultValue: String?,
                result: JsPromptResult?
            ): Boolean {

                return super.onJsPrompt(view, url, message, defaultValue, result)
            }
        }
    }
}