package com.imeepwni.jetpack.function.navigation.animal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import com.imeepwni.jetpack.databinding.FragmentAnimalBinding

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
class AnimalFragment : BaseFragment() {

    private val args: AnimalFragmentArgs by navArgs()
    private lateinit var binding: FragmentAnimalBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_animal, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.animalName = args.animalName
    }
}