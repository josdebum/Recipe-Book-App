package com.example.recipebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class NotificationListAdapter (private val list: ArrayList<Notification>,
                               private val context: Context
) : RecyclerView.Adapter<NotificationListAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(notification: Notification ) {
            var messageby: TextView = itemView.findViewById(R.id.message_by) as TextView
            var date: TextView = itemView.findViewById(R.id.date) as TextView

            messageby.text = notification.message_by
            date.text = notification.date




            itemView.setOnClickListener {

                Toast.makeText(context, messageby.text, Toast.LENGTH_LONG ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationListAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.notification_list, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NotificationListAdapter.ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


}