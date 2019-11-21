package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.function.navigation.NavigationFragmentDirections.Companion.actionNavigationFragmentToAnimalFragment
import com.imeepwni.jetpack.function.navigation.NavigationFragmentDirections.Companion.actionNavigationFragmentToPlantFragment
import com.imeepwni.jetpack.function.navigation.NavigationFragmentDirections.Companion.actionNavigationFragmentToSearchFragment
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
            actionNavigationFragmentToPlantFragment().run(::navigate)
        }
        btn_animal.setOnClickListener {
            actionNavigationFragmentToAnimalFragment().run(::navigate)
        }
        btn_search_dialog.setOnClickListener {
            actionNavigationFragmentToSearchFragment().run(::navigate)
        }
    }

    private fun navigate(action: NavDirections) {
        findNavController().navigate(action)
    }
}