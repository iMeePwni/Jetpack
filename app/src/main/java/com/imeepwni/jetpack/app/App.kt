package com.imeepwni.jetpack.app

import android.app.Application

/**
 * 作者：Created by guofeng on 2019/10/19
 * 邮箱：feng.guo@bees360.com
 */
lateinit var app: App

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}