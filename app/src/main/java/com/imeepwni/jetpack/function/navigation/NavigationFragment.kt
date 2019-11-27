package com.imeepwni.jetpack.function.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.createNavigateOnClickListener
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.app.toast
import com.imeepwni.jetpack.function.navigation.NavigationFragmentDirections.Companion.actionNavigationFragmentToPlantFragment
import com.imeepwni.jetpack.function.navigation.NavigationFragmentDirections.Companion.actionNavigationFragmentToSearchFragment
import com.imeepwni.jetpack.function.navigation.animal.AnimalFragmentArgs
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

        val toBundle = AnimalFragmentArgs(animals.shuffled().first()).toBundle()
        val extras = FragmentNavigatorExtras(btn_animal to getString(R.string.animal))

        btn_animal.setOnClickListener {
            findNavController().navigate(R.id.animalFragment, toBundle, null, extras)
        }

        actionNavigationFragmentToSearchFragment()
                .let(::createNavigateOnClickListener)
                .let { btn_search_dialog.setOnClickListener(it) }

        findNavController().addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.plantFragment -> toast("Welcome to PlantFragment")
            }
        }
    }

}