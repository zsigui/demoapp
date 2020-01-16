package com.jackiez.demoapp.login.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackiez.architecture.BaseFragment
import com.jackiez.demoapp.R
import com.jackiez.demoapp.common.utils.ToastUtil
import kotlinx.android.synthetic.main.fragment_login.*
import org.greenrobot.eventbus.EventBus

/**
 * Description :
 * Author : jackizez
 * Date : 2019/10/29
 */
class LoginFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginVideoBg.setVideoPath("")
        btnLogin.setOnClickListener {
            ToastUtil.showS("登录逻辑触发中……")
        }
    }
}