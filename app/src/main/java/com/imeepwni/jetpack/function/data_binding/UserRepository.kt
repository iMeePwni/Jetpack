package com.imeepwni.jetpack.function.data_binding

import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.app
import com.imeepwni.jetpack.data.User
import kotlin.random.Random

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
object UserRepository {

    private val names by lazy { app.resources.getStringArray(R.array.random_name) }

    fun getRandomUsers(): List<User> = (1..10).map { createRandomUser() }

    private fun createRandomUser(): User {
        return User(getRandomName(), getRandomName(), getRandomIsAdult())
    }

    private fun getRandomName(): String {
        return names.random()
    }

    private fun getRandomIsAdult(): Boolean {
        return Random.nextBoolean()
    }
}