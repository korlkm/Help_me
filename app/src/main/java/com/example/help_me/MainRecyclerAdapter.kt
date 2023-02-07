package com.example.help_me

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerAdapter() :
    RecyclerView.Adapter<MainRecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        public var itemimage: ImageView = itemView.findViewById(R.id.item_image)
        public var itemtitle: TextView = itemView.findViewById(R.id.item_title)
        public var itemdetail: TextView = itemView.findViewById(R.id.item_detail)
        public var item: Button = itemView.findViewById<Button>(R.id.and)
    }

    // 1. Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MainRecyclerAdapter.MyViewHolder {
        // create a new view
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_card_layout, parent, false)

        return MyViewHolder(cardView)
    }

    // 2. Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.itemimage.setImageResource(R.drawable.baseline_catching_pokemon_24)
        holder.itemtitle.setText("이경민")
        holder.itemdetail.setText("개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어개발하기싫어")
        holder.item.setText("And")
    }

    // 3. Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return 10
    }
}