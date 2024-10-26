package org.dc.brildmitry.vk_project1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val context = holder.itemView.context

        val backgroundColor = if (position % 2 == 0) {
            ContextCompat.getColor(context, R.color.celtic_blue)
        } else {
            ContextCompat.getColor(context, R.color.rose_red)
        }

        holder.bind(items[position], backgroundColor)
    }

    fun setItems(list: List<Int>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun addItems(item: Int) {
        items.add(item)
        notifyDataSetChanged()
    }

    fun getItemPositions(): ArrayList<Int> {
        return ArrayList(items)
    }
}