package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ViewBinding


class Adapter(var data: List<CardInfo>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(private val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cardInfo: CardInfo) {
            with(binding) {
                title.text = cardInfo.title
                priority.text = cardInfo.priority
                // Set background color based on priority
                when (cardInfo.priority.toLowerCase()) {
                    "high" -> mylayout.setBackgroundColor(Color.parseColor("#F05454"))
                    "medium" -> mylayout.setBackgroundColor(Color.parseColor("#EDC988"))
                    else -> mylayout.setBackgroundColor(Color.parseColor("#00917C"))
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Update::class.java)
            intent.putExtra("id", position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}