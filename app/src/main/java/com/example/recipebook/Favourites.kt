package com.example.recipebook

import android.content.Context
import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_favourites.*
import kotlinx.android.synthetic.main.favourite_grid_list.*
import kotlinx.android.synthetic.main.favourite_grid_list.view.*

class Favourites : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)
        initView()
    }

    private fun initView() {
        favouriteRecycler.layoutManager = GridLayoutManager(this,2)

        //This will for default android divider
        favouriteRecycler.addItemDecoration(GridItemDecoration(10, 2))

        val movieListAdapter = FavouriteListGridRecyclerAdapter()
        favouriteRecycler.adapter = movieListAdapter
        movieListAdapter.setMovieList(generateDummyData())


    }

    private fun generateDummyData(): List<FavouriteModel> {
        val listOfFavourites = mutableListOf<FavouriteModel>()

        var favouriteModel =  FavouriteModel(  "Sausage & Peppers Group", R.drawable.favourite1, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel =  FavouriteModel(  "Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel =  FavouriteModel(  "Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)


        favouriteModel =  FavouriteModel(  "Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel =  FavouriteModel(  "Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)






        return listOfFavourites

    }



}