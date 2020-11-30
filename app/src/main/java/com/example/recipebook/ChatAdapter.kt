package com.example.recipebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.chatitem.view.*

class ChatAdapter (private val list: ArrayList<Message>,
                   private val context: Context
) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(message: Message) {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView



            message.text = message.message.toString()




            itemView.setOnClickListener {


            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chat_message_item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])


    }
}