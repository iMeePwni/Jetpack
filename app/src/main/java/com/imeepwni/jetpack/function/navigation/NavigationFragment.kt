package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import kotlinx.android.synthetic.main.fragment_navigation.*

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class NavigationFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_plant.setOnClickListener {
            val action = NavigationFragmentDirections.actionNavigationFragmentToPlantFragment()
            it.findNavController().navigate(action)
        }
        btn_animal.setOnClickListener {
            val action = NavigationFragmentDirections.actionNavigationFragmentToAnimalFragment()
            it.findNavController().navigate(action)
        }
    }
}