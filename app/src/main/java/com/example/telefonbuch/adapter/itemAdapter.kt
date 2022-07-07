package com.example.telefonbuch.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.telefonbuch.R
import com.example.telefonbuch.data.model.Contact

class ItemAdapter (
    private val context:Context,
    private val dataset: List<Contact>

        ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

            class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val textViewName: TextView = itemView.findViewById(R.id.textViewName)
                val textViewNumber: TextView = itemView.findViewById(R.id.textViewTelefonnummer)

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder{

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int){
        val item = dataset[position]
        holder.textViewName.text = item.name
        holder.textViewNumber.text = item.nummer

    }

    override fun getItemCount(): Int {
        return dataset.size

    }

}




