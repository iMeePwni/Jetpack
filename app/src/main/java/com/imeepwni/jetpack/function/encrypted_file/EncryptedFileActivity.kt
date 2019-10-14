package com.imeepwni.jetpack.function.encrypted_file

import android.os.Bundle
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.app.BaseActivity
import com.imeepwni.jetpack.app.toast
import kotlinx.android.synthetic.main.activity_encrypted_file.*

/**
 * 作者：Created by guofeng on 2019/10/12
 * 邮箱：feng.guo@bees360.com
 */
class EncryptedFileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encrypted_file)

        initView()
    }

    private fun initView() {
        btn_read_file.setOnClickListener {
            toast("You Click READ Button")
        }
        btn_commit_input.setOnClickListener {
            toast("You Click WRITE Button")
        }
    }

}