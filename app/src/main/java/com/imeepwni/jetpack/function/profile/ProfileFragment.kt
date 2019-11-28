package com.imeepwni.jetpack.function.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.app.toast
import com.imeepwni.jetpack.function.profile.ProfileFragmentDirections.Companion.actionGlobalLoginFragment
import com.imeepwni.jetpack.view_model.LoginViewModel
import com.imeepwni.jetpack.view_model.LoginViewModel.AuthenticationState.*

/**
 * 作者：Created by guofeng on 2019/11/22
 * 邮箱：feng.guo@bees360.com
 */
class ProfileFragment : BaseFragment() {

    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.authenticationState.observe(viewLifecycleOwner, Observer {
            when (it) {
                AUTHENTICATED -> toast("Welcome")
                UNAUTHENTICATED -> findNavController().navigate(actionGlobalLoginFragment())
                INVALID_AUTHENTICATION -> toast("Invalid !!")
                else -> toast("WTF !!")
            }
        })
    }

}