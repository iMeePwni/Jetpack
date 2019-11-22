package com.imeepwni.jetpack.function.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.app.toast
import com.imeepwni.jetpack.databinding.FragmentLoginBinding
import com.imeepwni.jetpack.view_model.LoginViewModel
import com.imeepwni.jetpack.view_model.LoginViewModel.AuthenticationState.AUTHENTICATED
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * 作者：Created by guofeng on 2019/11/22
 * 邮箱：feng.guo@bees360.com
 */
class LoginFragment : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding
    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_login.setOnClickListener {
            viewModel.authenticate(binding.name.orEmpty(), binding.password.orEmpty())
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                viewModel.refuseAuthentication()
                findNavController().popBackStack(R.id.mainFragment, false)
            }
        })

        viewModel.authenticationState.observe(viewLifecycleOwner, Observer {
            when (it) {
                AUTHENTICATED -> findNavController().popBackStack()
                else -> toast(it.toString())
            }
        })
    }

}