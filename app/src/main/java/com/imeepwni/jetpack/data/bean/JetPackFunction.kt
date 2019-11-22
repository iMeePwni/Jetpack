package com.imeepwni.jetpack.data.bean

import androidx.annotation.StringRes
import androidx.navigation.NavDirections

/**
 * 作者：Created by guofeng on 2019/10/10
 * 邮箱：feng.guo@bees360.com
 */
data class JetPackFunction(
        @StringRes
        val name: Int,
        val action: NavDirections)