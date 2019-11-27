package com.imeepwni.jetpack.app

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ActivityNavigator

/**
 * 作者：Created by guofeng on 2019/10/12
 * 邮箱：feng.guo@bees360.com
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun finish() {
        super.finish()
        ActivityNavigator.applyPopAnimationsToPendingTransition(this)
    }
}

internal fun BaseActivity.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}