package com.imeepwni.jetpack.function.navigation.view_pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment

/**
 * 作者：Created by guofeng on 2019/11/27
 * 邮箱：feng.guo@bees360.com
 */
class NumberFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_number, container, false)
    }
}