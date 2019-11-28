package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class NavigationActivity : BaseActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        navController = findNavController(R.id.fragment)

        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}