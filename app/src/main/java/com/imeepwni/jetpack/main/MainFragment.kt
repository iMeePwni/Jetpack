package com.imeepwni.jetpack.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.data.bean.JetPackFunction
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToDataBindingActivity
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToEncryptedFileActivity
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToLifecyclesActivity
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToLoginFragment
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToNavigationActivity
import com.imeepwni.jetpack.main.MainFragmentDirections.Companion.actionMainFragmentToProfileFragment
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * 作者：Created by guofeng on 2019/11/21
 * 邮箱：feng.guo@bees360.com
 */
class MainFragment : BaseFragment() {
    private lateinit var jetPackFunctions: List<JetPackFunction>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()
        initView()
    }

    private fun initData() {
        jetPackFunctions = listOf(JetPackFunction(R.string.encrypted_file, actionMainFragmentToEncryptedFileActivity()),
                JetPackFunction(R.string.data_binding, actionMainFragmentToDataBindingActivity()),
                JetPackFunction(R.string.lifecycles, actionMainFragmentToLifecyclesActivity()),
                JetPackFunction(R.string.navigation, actionMainFragmentToNavigationActivity()),
                JetPackFunction(R.string.login, actionMainFragmentToLoginFragment()),
                JetPackFunction(R.string.profile, actionMainFragmentToProfileFragment())
        )
    }

    private fun initView() {
        rv_content.run {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = FunctionAdapter(jetPackFunctions)
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
        }
    }
}