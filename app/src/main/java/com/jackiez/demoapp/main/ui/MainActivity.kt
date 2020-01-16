package com.jackiez.demoapp.main.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jackiez.architecture.BaseActivity
import com.jackiez.demoapp.R
import com.jackiez.demoapp.common.dagger.DaggerController
import com.jackiez.demoapp.login.dagger.LoginComponent
import com.jackiez.demoapp.main.ui.fragment.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        DaggerController.get().appComponent
    }

}
