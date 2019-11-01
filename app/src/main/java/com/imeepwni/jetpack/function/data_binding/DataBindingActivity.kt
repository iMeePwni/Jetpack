package com.imeepwni.jetpack.function.data_binding

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity
import com.imeepwni.jetpack.app.toast
import com.imeepwni.jetpack.data.User
import com.imeepwni.jetpack.databinding.ActivityDataBindingBinding

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
class DataBindingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)

        with(binding) {
            user = User(firstName = "JoJo", lastName = "Lee")
            handlers = object : MyHandler {
                override fun onToastUserDetailClick() {
                    toast(user.toString())
                }
            }
        }
    }
}