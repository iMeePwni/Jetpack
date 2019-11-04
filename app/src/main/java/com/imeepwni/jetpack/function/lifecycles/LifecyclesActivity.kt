package com.imeepwni.jetpack.function.lifecycles

import android.os.Bundle
import com.imeepwni.jetpack.app.BaseActivity

/**
 * 作者：Created by guofeng on 2019/11/4
 * 邮箱：feng.guo@bees360.com
 */
class LifecyclesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(MyObserver())
    }
}