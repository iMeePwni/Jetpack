package com.imeepwni.jetpack.function.data_binding

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity
import com.imeepwni.jetpack.data.bean.User
import com.imeepwni.jetpack.databinding.ActivityDataBindingBinding

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
class DataBindingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)
        val viewModel = MyViewModel()
        binding.viewModel = viewModel

        viewModel.mUser.observe(this, Observer<User> {
            binding.user = it
        })
    }
}