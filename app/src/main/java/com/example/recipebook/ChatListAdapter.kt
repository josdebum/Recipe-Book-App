package com.example.recipebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.ChatListAdapter.ViewHolder
import java.security.AccessController.getContext

class ChatListAdapter (private val list: ArrayList<Chats>,
                       private val context: Context
) : RecyclerView.Adapter<ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(chats : Chats) {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
            var image: ImageView = itemView.findViewById(R.id.userImage) as ImageView

            name.text = chats.name
            message.text = chats.message
            image.setImageResource(chats.image)



            itemView.setOnClickListener {

                Toast.makeText(context, name.text, Toast.LENGTH_LONG ).show()
                val intent = Intent( context, OpenedChat::class.java)
                context.startActivity(intent)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chatitem, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])


    }
}