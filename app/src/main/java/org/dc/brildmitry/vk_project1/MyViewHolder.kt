package org.dc.brildmitry.vk_project1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val text = view.findViewById<TextView>(R.id.text_1)
    val color = view.findViewById<ImageView>(R.id.image_1)
    fun bind(number: Int, background: Int) {
        text.text = "$number"
        color.setBackgroundColor(background)
    }
}