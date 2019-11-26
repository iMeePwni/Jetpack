package com.imeepwni.jetpack.function.navigation.plant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.createNavigateOnClickListener
import androidx.navigation.fragment.navArgs
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.databinding.FragmentPlantBinding
import kotlinx.android.synthetic.main.fragment_plant.*

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class PlantFragment : BaseFragment() {

    private val args: PlantFragmentArgs by navArgs()
    private lateinit var binding: FragmentPlantBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_plant, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_plant.text = getString(R.string.do_you_like_x, args.StringArgPlantName)

        PlantFragmentDirections.actionGlobalSearchFragment()
                .let(::createNavigateOnClickListener)
                .let { btn_search.setOnClickListener(it) }

        PlantFragmentDirections.actionPlantFragmentToLoopFragment()
                .let(::createNavigateOnClickListener)
                .let { btn_loop.setOnClickListener(it) }
    }
}