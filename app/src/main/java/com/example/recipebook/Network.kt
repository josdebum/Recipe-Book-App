package com.example.recipebook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_favourites.*
import kotlinx.android.synthetic.main.activity_network.*
import kotlinx.android.synthetic.main.network_items.view.*

class Network : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)
        initView()
    }

    private fun initView() {
        networkRecycler.layoutManager = GridLayoutManager(this, 2)

        //This will for default android divider
        networkRecycler.addItemDecoration(GridItemDecoration2(10, 2))

        val networkListAdapter = NetworkListGridRecyclerAdapter()
        networkRecycler.adapter = networkListAdapter
        networkListAdapter.setMovieList(generateDummyData())
    }

    private fun generateDummyData(): List<NetworkModel> {
        val listOfNetwork = mutableListOf<NetworkModel>()

        var networkModel = NetworkModel("Sausage and Peppers Group", R.drawable.josdebum)
        listOfNetwork.add(networkModel)

        networkModel = NetworkModel("Sausage and Peppers Group", R.drawable.josdebum)
        listOfNetwork.add(networkModel)

        networkModel = NetworkModel("Sausage and Peppers Group", R.drawable.josdebum)
        listOfNetwork.add(networkModel)

        networkModel = NetworkModel("Sausage and Peppers Group", R.drawable.josdebum)
        listOfNetwork.add(networkModel)



        return listOfNetwork
    }
}