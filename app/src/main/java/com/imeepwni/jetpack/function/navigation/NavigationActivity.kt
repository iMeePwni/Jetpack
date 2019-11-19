package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import androidx.fragment.app.commit
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class NavigationActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        supportFragmentManager.commit {
            add(R.id.fl_container, NavigationFragment())
        }
    }
}