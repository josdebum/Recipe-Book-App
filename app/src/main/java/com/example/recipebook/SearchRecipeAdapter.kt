package com.example.recipebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchRecipeAdapter(private val list: ArrayList<SearchRecipe>,
                          private val context: Context
) : RecyclerView.Adapter<SearchRecipeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchRecipeAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recipe_search_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(searchRecipe: SearchRecipe) {
            var name: TextView = itemView.findViewById(R.id.search_name) as TextView

            name.text = searchRecipe.recipe_name


            itemView.setOnClickListener{

            }


        }}
}