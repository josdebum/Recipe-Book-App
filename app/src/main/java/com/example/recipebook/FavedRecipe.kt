package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_faved_recipe.*

class FavedRecipe : AppCompatActivity() {
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

        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener { override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean){}

})}}