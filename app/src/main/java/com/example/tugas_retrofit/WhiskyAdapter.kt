package com.example.tugas_retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_retrofit.model.Whisky

class WhiskyAdapter(private val whiskyList: List<Whisky>) :
    RecyclerView.Adapter<WhiskyAdapter.WhiskyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhiskyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_whisky, parent, false)
        return WhiskyViewHolder(view)
    }

    override fun onBindViewHolder(holder: WhiskyViewHolder, position: Int) {
        val whisky = whiskyList[position]
        holder.tvWhiskyName.text = whisky.auction_name
    }

    override fun getItemCount(): Int {
        return whiskyList.size
    }

    class WhiskyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvWhiskyName: TextView = itemView.findViewById(R.id.txt_whisky_name)
    }
}
