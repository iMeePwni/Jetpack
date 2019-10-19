package com.imeepwni.jetpack.util

import androidx.core.content.edit
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.imeepwni.jetpack.app.app

/**
 * 作者：Created by guofeng on 2019/10/19
 * 邮箱：feng.guo@bees360.com
 */
private const val SP_NAME = "app"

// Although you can define your own key generation parameter specification, it's
// recommended that you use the value specified here.
private val keyGenParameterSpec = MasterKeys.AES256_GCM_SPEC
private val masterKeyAlias = MasterKeys.getOrCreate(keyGenParameterSpec)

object SharedPreferencesUtil {

    private val preferences by lazy {
        EncryptedSharedPreferences.create(
            SP_NAME,
            masterKeyAlias,
            app,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

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