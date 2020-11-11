package com.example.recipebook

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.favourite_grid_list.view.*
import java.util.*

class FavouriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(favouriteModel: FavouriteModel) {
        itemView.name.text = favouriteModel.name

        Glide.with(itemView.context).load(favouriteModel.like).into(itemView.likeButton)
        Glide.with(itemView.context).load(favouriteModel.image).into(itemView.Image)

    }
}