package com.example.recipebook

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.network_items.view.*

class NetworkViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(networkModel: NetworkModel) {
        itemView.networkName.text = networkModel.name

        Glide.with(itemView.context).load(networkModel.image).into(itemView.networkImage)

    }
}
