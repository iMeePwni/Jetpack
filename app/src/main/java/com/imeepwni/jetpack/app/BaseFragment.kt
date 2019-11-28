package com.imeepwni.jetpack.app

import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * 作者：Created by guofeng on 2019/11/19
 * 邮箱：feng.guo@bees360.com
 */
abstract class BaseFragment : Fragment() {

}

internal fun BaseFragment.toast(text: String) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}