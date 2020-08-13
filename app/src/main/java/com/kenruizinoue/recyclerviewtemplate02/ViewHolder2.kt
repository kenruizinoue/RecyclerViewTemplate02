package com.kenruizinoue.recyclerviewtemplate02

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder2 internal constructor(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    var yourView: TextView = itemView.findViewById(R.id.textView)

    fun bind(text: String) {
        // This method will be called anytime a list item is created or update its data
        // Do your stuff here
        yourView.text = text
    }
}