package com.imeepwni.jetpack.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imeepwni.jetpack.data.bean.JetPackFunction

/**
 * 作者：Created by guofeng on 2019/10/10
 * 邮箱：feng.guo@bees360.com
 */
class FunctionAdapter(private val functions: List<JetPackFunction>) : RecyclerView.Adapter<SimpleItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SimpleItemViewHolder.create(parent)

    override fun getItemCount() = functions.size

    override fun onBindViewHolder(holder: SimpleItemViewHolder, position: Int) {
        holder.bind(functions[position])
    }
}