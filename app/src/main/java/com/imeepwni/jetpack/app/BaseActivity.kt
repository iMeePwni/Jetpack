package com.imeepwni.jetpack.app

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * 作者：Created by guofeng on 2019/10/12
 * 邮箱：feng.guo@bees360.com
 */
abstract class BaseActivity : AppCompatActivity() {

}

internal fun BaseActivity.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}