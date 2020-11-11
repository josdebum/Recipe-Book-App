package com.example.recipebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



    class SearchRecipeAdapter2 (private val list: ArrayList<SearchRecipe2>,
                              private val context: Context
    ) : RecyclerView.Adapter<SearchRecipeAdapter2.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchRecipeAdapter2.ViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.recipe_search_item_2, parent, false)

            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return list.size

        }



        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder?.bindItem(list[position])
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            fun bindItem(searchRecipe2: SearchRecipe2) {
                var name: TextView = itemView.findViewById(R.id.search_name) as TextView

                name.text = searchRecipe2.recipe_name


                itemView.setOnClickListener{

                }


            }}
    }
