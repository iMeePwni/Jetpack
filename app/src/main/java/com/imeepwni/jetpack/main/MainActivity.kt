package com.imeepwni.jetpack.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imeepwni.jetpack.R
import com.imeepwni.jetpack.data.JetPackFunction
import com.imeepwni.jetpack.function.encrypted_file.EncryptedFileActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val jetPackFunctions = mutableListOf<JetPackFunction>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initView()
    }

    private fun initData() {
        jetPackFunctions.add(JetPackFunction(getString(R.string.encrypted_file)) {
            startActivity(Intent(this, EncryptedFileActivity::class.java))
        })
    }

    private fun initView() {
        rv_content.run {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = FunctionAdapter(jetPackFunctions)
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
        }
    }
}