package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_friends.*
import kotlinx.android.synthetic.main.frienditem.*

class Friends : AppCompatActivity() {

    private var adapter: FriendListAdapter? = null
    private var friendList: ArrayList<Friend>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        friendList = ArrayList<Friend>()
        layoutManager = LinearLayoutManager(this)
        adapter = FriendListAdapter(friendList!!, this)


        //setup list ( Recyclerview
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


        //load data
        for (i in 0..16) {
            val friend = Friend()
            friend.name = "James" + i
            friend.no_of_friends =  "James" + i
            friendList!!.add(friend)
        }
        adapter!!.notifyDataSetChanged()

    }
    }
