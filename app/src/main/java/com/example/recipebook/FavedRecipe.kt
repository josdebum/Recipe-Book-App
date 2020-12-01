package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_faved_recipe.*

class FavedRecipe : AppCompatActivity(), RatingBar.OnRatingBarChangeListener {
    var doubleClick: Boolean? = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faved_recipe)

        like.setOnClickListener(){

       like.setColorFilter(getResources().getColor(R.color.likeColor))
            if (doubleClick!!){
                doubleClick = true
                Handler().postDelayed({ doubleClick = false }, 2000)
                like.setColorFilter(getResources().getColor(R.color.white))

            }
    }

ratingBar.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{p0, p1, p2 ->}

        rating.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { p0, p1, p2 -> }
}


    override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}