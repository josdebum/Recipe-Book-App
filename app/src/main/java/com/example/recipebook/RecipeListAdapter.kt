package com.example.recipebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recipe_list_options.view.*

class RecipeListAdapter (private val list: ArrayList<Recipes>,
                         private val context: Context
) : RecyclerView.Adapter<RecipeListAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(recipes: Recipes ) {
            var recipe_search: TextView = itemView.findViewById(R.id.recipe_search) as TextView

            recipe_search.text = recipes.recipe_search




            itemView.setOnClickListener {
            }
        }
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeListAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recipe_list_options, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecipeListAdapter.ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


}