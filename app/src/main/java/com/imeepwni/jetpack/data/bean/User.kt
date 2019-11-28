package com.imeepwni.jetpack.data.bean

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
data class User(
        val firstName: String,
        val lastName: String,
        var isAdult: Boolean = false
)