package com.imeepwni.jetpack.util

import android.content.Context.MODE_PRIVATE
import androidx.core.content.edit
import com.imeepwni.jetpack.app.app

/**
 * 作者：Created by guofeng on 2019/10/19
 * 邮箱：feng.guo@bees360.com
 */
private const val SP_NAME = "app"

object SharedPreferencesUtil {

    private val preferences by lazy { app.getSharedPreferences(SP_NAME, MODE_PRIVATE) }

    fun putBoolean(key: String, value: Boolean) {
        preferences.edit {
            putBoolean(key, value)
        }
    }

    fun getBoolean(key: String, default: Boolean = false) = preferences.getBoolean(key, default)

    fun putString(key: String, value: String) {
        preferences.edit {
            putString(key, value)
        }
    }

    fun getString(key: String, default: String) = preferences.getString(key, default)
}