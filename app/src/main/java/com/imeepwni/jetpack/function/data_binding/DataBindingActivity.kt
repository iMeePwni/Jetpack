package com.imeepwni.jetpack.function.data_binding

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity
import com.imeepwni.jetpack.app.toast
import com.imeepwni.jetpack.databinding.ActivityDataBindingBinding

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
class DataBindingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)

        val randomUsers = UserRepository.getRandomUsers()
        with(binding) {
            users = randomUsers
            user = randomUsers.first()
            twoWayCheckStatus = false
            handlers = object : MyHandler {

                private fun currentUserIndex() = user?.let { randomUsers.indexOf(it) } ?: 0

                override fun onNextUserClick() {
                    user = randomUsers[(currentUserIndex() + 1) % randomUsers.size]
                }

                override fun onPreviousUserClick() {
                    user = randomUsers[(currentUserIndex() - 1) % randomUsers.size]
                }

                override fun onToastUserDetailClick() {
                    toast(user.toString())
                }

                override fun onShowCheckStatusClick() {
                    toast(twoWayCheckStatus.toString())
                }
            }
        }
    }
}