package com.example.recipebook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_favourites.*
import kotlinx.android.synthetic.main.activity_network.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Network : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        initView()
    }

    private fun initView() {
        networkRecycler.layoutManager = GridLayoutManager(this, 2)

        //This will for default android divider
        networkRecycler.addItemDecoration(GridItemDecoration(10, 2))

        val movieListAdapter = FavouriteListGridRecyclerAdapter()
        networkRecycler.adapter = movieListAdapter
        movieListAdapter.setMovieList(generateDummyData())


    }

    private fun generateDummyData(): List<FavouriteModel> {
        val listOfFavourites = mutableListOf<FavouriteModel>()

        var favouriteModel =
            FavouriteModel("Sausage & Peppers Group", R.drawable.favourite1, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel = FavouriteModel("Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel = FavouriteModel("Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel = FavouriteModel("Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel = FavouriteModel("Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)


        favouriteModel =
            FavouriteModel("Strawberry Wonders", R.drawable.favourite2, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)
        favouriteModel = FavouriteModel("Pro-bros", R.drawable.favourite3, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Colours of Strawberry", R.drawable.favourite4, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel =
            FavouriteModel("Food fitfam", R.drawable.favourite5, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)

        favouriteModel = FavouriteModel("Veges Gang", R.drawable.favourite6, R.drawable.like_button)
        listOfFavourites.add(favouriteModel)






        return listOfFavourites

    }

}