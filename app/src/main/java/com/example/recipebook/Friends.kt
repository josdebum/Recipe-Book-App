package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_friends.*
import kotlinx.android.synthetic.main.frienditem.*

class Friends : AppCompatActivity() {

    private var adapter: FriendListAdapter? = null
    private var friendList: ArrayList<Friend>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var button: Button? = null

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
        friendList!!.add(Friend("Adebayo Apercu", "100K Friends", R.drawable.chat_image))
                friendList!!.add(Friend("Ronke Igboegwu", "200 Friends", R.drawable.chat_image_2))
        friendList!!.add(Friend("Ekaite Akande", "10K Friends", R.drawable.chat_image_3))
        friendList!!.add(Friend("Adedunni Nwaneri", "190 Friends", R.drawable.josdebum))

        friendList!!.add(Friend("Adebayo Apercu", "100K Friends", R.drawable.chat_image))
        friendList!!.add(Friend("Ronke Igboegwu", "200 Friends", R.drawable.chat_image_2))
        friendList!!.add(Friend("Ekaite Akande", "10K Friends", R.drawable.chat_image_3))
        friendList!!.add(Friend("Adedunni Nwaneri", "190 Friends", R.drawable.josdebum))

        friendList!!.add(Friend("Adebayo Apercu", "100K Friends", R.drawable.chat_image))
        friendList!!.add(Friend("Ronke Igboegwu", "200 Friends", R.drawable.chat_image_2))
        friendList!!.add(Friend("Ekaite Akande", "10K Friends", R.drawable.chat_image_3))
        friendList!!.add(Friend("Adedunni Nwaneri", "190 Friends", R.drawable.josdebum))



    }

    }
