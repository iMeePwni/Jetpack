package com.imeepwni.jetpack.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.imeepwni.jetpack.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment)

        initToolbar()
        initNavigationView()
    }

    private fun initToolbar() {
        NavigationUI.setupWithNavController(toolbar, navController)
        toolbar.setOnMenuItemClickListener {
            it.onNavDestinationSelected(navController)
        }
    }

    private fun initNavigationView() {
        nav_view.setupWithNavController(navController)
    }
}