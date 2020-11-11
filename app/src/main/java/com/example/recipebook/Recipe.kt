package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recipe1.*
import kotlinx.android.synthetic.main.recipe_search_item.*

class Recipe : AppCompatActivity() {

    private var adapter: SearchRecipeAdapter? = null
    private var recipeList: ArrayList<SearchRecipe>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe1)

        recipeList = ArrayList<SearchRecipe>()
        layoutManager = LinearLayoutManager(this)
        adapter = SearchRecipeAdapter(recipeList!!, this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        recipeList!!.add(SearchRecipe("My search history"))
        recipeList!!.add(SearchRecipe("My favourite recipes"))
        recipeList!!.add(SearchRecipe("Easy Mexican Casserole"))
        recipeList!!.add(SearchRecipe("Thai Chicken Balls"))
        recipeList!!.add(SearchRecipe("Honey Mustard Pork Chops"))
        recipeList!!.add(SearchRecipe("Salsa Chicken Rice Casserole"))
        recipeList!!.add(SearchRecipe("Banana Cinnamon Roll Casserole"))
        recipeList!!.add(SearchRecipe("My search history"))
        recipeList!!.add(SearchRecipe("My search history"))
        recipeList!!.add(SearchRecipe("My search history"))
        recipeList!!.add(SearchRecipe("My search history"))

        search_by_ingredient.setOnClickListener(){
            startActivity(Intent(this, Recipe2::class.java))
        }

    }

}