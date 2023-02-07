package com.example.help_me

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapterHorizontal():  RecyclerView.Adapter<ListAdapterHorizontal.ListAdapter>(){

    class ListAdapter(val layout: View): RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter {
        return ListAdapter(LayoutInflater.from(parent.context).inflate(R.layout.main_list_item_hori, parent, false))
    }

    override fun onBindViewHolder(holder: ListAdapter, position: Int) {
        //holder.layout.textImg.text = list[position]

    }

    override fun getItemCount(): Int = 5
}