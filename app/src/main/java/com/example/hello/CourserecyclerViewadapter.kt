package com.example.hello

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hello_h.R
import kotlinx.android.synthetic.main.row_courses_item.view.*

class coursesrecyclerviewadapter(val namesList: List<String>) :
    RecyclerView.Adapter<coursesrecyclerviewadapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_courses_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvcourses.text = namesList[position]
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}