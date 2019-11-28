package com.imeepwni.jetpack.function.navigation.view_pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseFragment
import kotlinx.android.synthetic.main.fragment_view_pager.*

/**
 * 作者：Created by guofeng on 2019/11/27
 * 邮箱：feng.guo@bees360.com
 */
class ViewPagerFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tab_layout.tabMode = TabLayout.MODE_SCROLLABLE
        view_pager.adapter = MyViewPagerAdapter(this)

        TabLayoutMediator(tab_layout, view_pager) { tab, position ->
            tab.text = position.toString()
        }.attach()
    }
}

class MyViewPagerAdapter(val fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 10

    override fun createFragment(position: Int) = NumberFragment()

}

