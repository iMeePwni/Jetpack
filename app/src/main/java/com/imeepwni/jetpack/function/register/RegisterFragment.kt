package com.imeepwni.jetpack.function.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.createNavigateOnClickListener
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.databinding.FragmentRegisterBinding
import kotlinx.android.synthetic.main.fragment_register.*

/**
 * 作者：Created by guofeng on 2019/11/22
 * 邮箱：feng.guo@bees360.com
 */
class RegisterFragment : BaseFragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        RegisterFragmentDirections.actionRegisterFragmentToAboutFragment()
                .let(::createNavigateOnClickListener)
                .let { tv_sign_up.setOnClickListener(it) }
    }
}