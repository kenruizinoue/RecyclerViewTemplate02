package com.kenruizinoue.recyclerviewtemplate02

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

const val VIEW_TYPE_ONE = 1
const val VIEW_TYPE_TWO = 2

class CustomAdapter(private var list: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // return the type RecyclerView.ViewHolder so it can be ViewHolder1 or ViewHolder2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_ONE) {
            ViewHolder1(
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_1, parent, false)
            )
        } else ViewHolder2(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // put your condition, according to your requirements
        if (position % 2 == 0) {
            (holder as ViewHolder1).bind(list[position])
        } else {
            (holder as ViewHolder2).bind(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        // here you can get decide from your model's ArrayList, which type of view you need to load
        return if (position % 2 == 0) {
            VIEW_TYPE_ONE
        } else VIEW_TYPE_TWO
    }
}