package com.example.recipebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.chatitem.view.*

class ChatAdapter (private val message: ArrayList<Message>,
                   private val context: Context
) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindItem(message: Message) {


            var inputMessage: TextView = itemView.findViewById(R.id.name) as TextView

            inputMessage.text = message.input_message


             itemView.setOnClickListener {


            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chat_message_item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return message.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(message[position])


    }
}