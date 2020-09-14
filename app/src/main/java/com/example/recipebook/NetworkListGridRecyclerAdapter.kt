package com.example.recipebook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NetworkListGridRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfNetwork = listOf<NetworkModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NetworkViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.network_items, parent, false))
    }

    override fun getItemCount(): Int = listOfNetwork.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val networkViewHolder = viewHolder as NetworkViewHolder
        networkViewHolder.bindView(listOfNetwork[position])
    }

    fun setMovieList(listOfNetwork: List<NetworkModel>) {
        this.listOfNetwork = listOfNetwork
        notifyDataSetChanged()
    }
}
