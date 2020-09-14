package com.example.recipebook

import android.content.Context
import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        val listOfMovie = mutableListOf<FavouriteModel>()

        var favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)
        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)

        favouriteModel =  FavouriteModel(  "Avengers", R.drawable.profile_background, R.drawable.like_button)
        listOfMovie.add(favouriteModel)


        return listOfMovie
    }
}