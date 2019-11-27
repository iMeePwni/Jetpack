package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.createNavigateOnClickListener
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

    private val plants = listOf("Apple", "Orange", "Banana")
    private val animals = listOf("Ant", "Tiger", "Lion", "Elephant")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionNavigationFragmentToPlantFragment(plants.shuffled().first())
                .let(::createNavigateOnClickListener)
                .let { btn_plant.setOnClickListener(it) }

        actionNavigationFragmentToAnimalFragment(animals.shuffled().first())
                .let(::createNavigateOnClickListener)
                .let { btn_animal.setOnClickListener(it) }

        actionNavigationFragmentToSearchFragment()
                .let(::createNavigateOnClickListener)
                .let { btn_search_dialog.setOnClickListener(it) }
    }

}