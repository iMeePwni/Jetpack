package com.imeepwni.jetpack.function.data_binding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imeepwni.jetpack.data.User

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class MyViewModel : ViewModel(), MyHandler {

    private val mRandomUsers = UserRepository.getRandomUsers()
    val mUser: MutableLiveData<User> = MutableLiveData()
    var twoWayCheckStatus = false

    private fun currentUserIndex() = mUser.value?.let { mRandomUsers.indexOf(it) } ?: 0

    override fun onNextUserClick() {
        val nextIndex = (currentUserIndex() + 1) % mRandomUsers.size
        mUser.value = mRandomUsers[nextIndex]
    }

    override fun onPreviousUserClick() {
        val previousIndex = (currentUserIndex() + mRandomUsers.size - 1) % mRandomUsers.size
        mUser.value = mRandomUsers[previousIndex]
    }

    override fun onToastUserDetailClick() {
        Log.d("MyViewModel", mUser.value.toString())
    }

    override fun onShowCheckStatusClick() {
        Log.d("MyViewModel", twoWayCheckStatus.toString())
    }
}