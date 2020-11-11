package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recipe1.*

class Recipe2 : AppCompatActivity() {
    private var adapter: SearchRecipeAdapter2? = null
    private var recipeList2: ArrayList<SearchRecipe2>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe2)

        recipeList2 = ArrayList<SearchRecipe2>()
        layoutManager = LinearLayoutManager(this)
        adapter = SearchRecipeAdapter2(recipeList2!!, this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        recipeList2!!.add(SearchRecipe2("My search history"))
        recipeList2!!.add(SearchRecipe2("My favourite recipes"))
        recipeList2!!.add(SearchRecipe2("Easy Mexican Casserole"))
        recipeList2!!.add(SearchRecipe2("Thai Chicken Balls"))
        recipeList2!!.add(SearchRecipe2("Honey Mustard Pork Chops"))
        recipeList2!!.add(SearchRecipe2("Salsa Chicken Rice Casserole"))
        recipeList2!!.add(SearchRecipe2("Banana Cinnamon Roll Casserole"))
        recipeList2!!.add(SearchRecipe2("My search history"))
        recipeList2!!.add(SearchRecipe2("My search history"))
        recipeList2!!.add(SearchRecipe2("My search history"))
        recipeList2!!.add(SearchRecipe2("My search history"))

    }
}