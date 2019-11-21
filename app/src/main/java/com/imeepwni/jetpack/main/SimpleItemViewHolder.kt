package com.imeepwni.jetpack.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.imeepwni.jetpack.data.JetPackFunction

/**
 * 作者：Created by guofeng on 2019/10/10
 * 邮箱：feng.guo@bees360.com
 */
class SimpleItemViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var mTVTitle: TextView = itemView.findViewById(android.R.id.text1)

    fun bind(jetPackFunction: JetPackFunction) {
        mTVTitle.setText(jetPackFunction.name)
        mTVTitle.setOnClickListener {
            it.findNavController().navigate(jetPackFunction.action)
        }
    }

    companion object {

        fun create(parent: ViewGroup): SimpleItemViewHolder {
            return LayoutInflater.from(parent.context)
                    .inflate(android.R.layout.simple_list_item_1, parent, false).let {
                        SimpleItemViewHolder(it)
                    }
        }
    }
}