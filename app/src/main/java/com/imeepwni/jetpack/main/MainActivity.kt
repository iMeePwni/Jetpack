package com.imeepwni.jetpack.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.view_model.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment)

        initToolbar()
        initNavigationView()

        viewModel.getUsers().observe(this, Observer {
            Log.d("get data", "Users: $it")
        })
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