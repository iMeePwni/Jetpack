package com.imeepwni.jetpack.function.navigation.plant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.createNavigateOnClickListener
import androidx.navigation.fragment.navArgs
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import kotlinx.android.synthetic.main.fragment_plant.*

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class PlantFragment : BaseFragment() {

    private val args: PlantFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_plant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_plant.text = args.StringArgPlantName

        PlantFragmentDirections.actionGlobalSearchFragment().let(::createNavigateOnClickListener)
                .let { btn_search.setOnClickListener(it) }
    }
}