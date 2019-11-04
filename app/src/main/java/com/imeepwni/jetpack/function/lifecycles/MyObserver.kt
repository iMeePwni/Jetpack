package com.imeepwni.jetpack.function.lifecycles

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * 作者：Created by guofeng on 2019/11/4
 * 邮箱：feng.guo@bees360.com
 */
class MyObserver : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener() {
        Log.d("MyObserver", "connectListener invoke.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnectListener() {
        Log.d("MyObserver", "disconnectListener invoke.")
    }
}