package com.imeepwni.jetpack.function.navigation.loop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.createNavigateOnClickListener
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import kotlinx.android.synthetic.main.fragment_loop.*

/**
 * 作者：Created by guofeng on 2019/11/22
 * 邮箱：feng.guo@bees360.com
 */
class LoopFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_loop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        LoopFragmentDirections.actionLoopFragmentToNavigationFragment()
                .let(::createNavigateOnClickListener)
                .let { tv_navigation.setOnClickListener(it) }
    }
}