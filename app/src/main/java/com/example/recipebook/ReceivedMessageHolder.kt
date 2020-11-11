package com.example.recipebook

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ReceivedMessageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var messageText: TextView? = null
    var profileImage: ImageView? = null

}