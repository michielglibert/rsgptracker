package com.example.michielglibert.runescapegptracker.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.michielglibert.runescapegptracker.R
import com.example.michielglibert.runescapegptracker.models.Flip
import com.example.michielglibert.runescapegptracker.models.inflate
import kotlinx.android.synthetic.main.flipped_item.view.*

/**
 * Created by Michiel Glibert on 22/01/2018.
 */

class FlipAdapter(val items: List<Flip>, val listener: (Flip) -> Unit) : RecyclerView.Adapter<FlipAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.flipped_item))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Flip, listener: (Flip) -> Unit) = with(itemView) {
            txtFlipName.setText(item.name)
            val profit = item.calculateProfit()
            txtProfit.setText(if (profit > 0) "+$profit gp" else "$profit gp")
            setOnClickListener { listener(item) }
        }
    }

}