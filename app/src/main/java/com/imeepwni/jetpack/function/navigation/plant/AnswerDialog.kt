package com.imeepwni.jetpack.function.navigation.plant

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs

/**
 * 作者：Created by guofeng on 2019/11/26
 * 邮箱：feng.guo@bees360.com
 */
class AnswerDialog : DialogFragment() {

    private val args: AnswerDialogArgs by navArgs()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val listener: DialogInterface.OnClickListener = DialogInterface.OnClickListener { _, _ ->
            Log.d("Answer", "You like it!!")
        }
        return AlertDialog.Builder(context!!)
                .setMessage(args.question)
                .setPositiveButton(android.R.string.yes, listener)
                .create()
    }
}