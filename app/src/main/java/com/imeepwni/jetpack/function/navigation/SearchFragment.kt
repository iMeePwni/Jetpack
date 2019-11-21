package com.imeepwni.jetpack.function.navigation

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.imeepwni.jetpack.R

/**
 * 作者：Created by guofeng on 2019/11/21
 * 邮箱：feng.guo@bees360.com
 */
class SearchFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(context!!)
                .setMessage(getString(R.string.search))
                .create()
    }
}