package com.example.recipebook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class FavouriteListGridRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfMovies = listOf<FavouriteModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FavouriteViewHolder(LayoutInflater.from(parent.context).
            inflate(R.layout.favourite_grid_list, parent, false))
    }

    override fun getItemCount(): Int = listOfMovies.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val favouriteViewHolder = viewHolder as FavouriteViewHolder
        favouriteViewHolder.bindView(listOfMovies[position])
        viewHolder.itemView.setOnClickListener {
            val context=viewHolder.itemView.context
            val intent = Intent( context, FavedRecipe::class.java)
            context.startActivity(intent)

        }


    }

    fun setMovieList(listOfMovies: List<FavouriteModel>) {
        this.listOfMovies = listOfMovies
        notifyDataSetChanged()
    }



}