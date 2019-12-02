package com.imeepwni.jetpack.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imeepwni.jetpack.data.bean.User

/**
 * 作者：Created by guofeng on 2019/11/30
 * 邮箱：feng.guo@bees360.com
 */
class MyViewModel : ViewModel() {

    private val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData<List<User>>().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<User>> = users

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}