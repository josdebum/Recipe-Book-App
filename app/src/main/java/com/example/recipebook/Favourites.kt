package com.example.recipebook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_favourites.*
import kotlinx.android.synthetic.main.favourite_grid_list.view.*

class Favourites : AppCompatActivity() {

    var adapter: FoodAdapter? = null
    var foodsList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)

        foodsList.add(Food("Coffee", R.drawable.ic_logo, R.drawable.like_button))
        foodsList.add(Food("Espersso", R.drawable.profile_background, R.drawable.like_button))

            grid.adapter = adapter
    }

    class FoodAdapter : BaseAdapter {
        var foodsList = ArrayList<Food>()
        var context: Context? = null

        constructor(context: Context, foodsList: ArrayList<Food>) : super() {
            this.context = context
            this.foodsList = foodsList
        }

        override fun getCount(): Int {
            return foodsList.size
        }

        override fun getItem(position: Int): Any {
            return foodsList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val food = this.foodsList[position]

            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView = inflator.inflate(R.layout.favourite_grid_list, null)
            foodView.favourite_image.setImageResource(food.image!!)
            foodView.favourite_name.text = food.name!!
            foodView.like.setImageResource(food.like!!)

            return foodView
        }
    }
    }

