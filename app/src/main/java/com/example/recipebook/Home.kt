package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_friends.*
import kotlinx.android.synthetic.main.activity_home.*


class Home : AppCompatActivity() {

    private var adapter: NotificationListAdapter? = null
    private var notificationList: ArrayList<Notification>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        notificationList = ArrayList<Notification>()
        layoutManager = LinearLayoutManager(this)
        adapter = NotificationListAdapter(notificationList!!, this)

        notification_recycler_view.layoutManager = layoutManager
        notification_recycler_view.adapter = adapter


        //load data
        for (i in 0..16) {
            val notification = Notification()
            notification.message_by = "James" + i
            notification.date =  "James" + i
            notificationList!!.add(notification)


        }
        adapter!!.notifyDataSetChanged()



        friend.setOnClickListener {
            startActivity(Intent(this, Friends::class.java))
        }

        favourites.setOnClickListener {
            startActivity(Intent(this, Favourites::class.java))
        }

        friend.setOnClickListener {
            startActivity(Intent(this, Friends::class.java))
        }

        chats.setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        networks.setOnClickListener(){
            startActivity(Intent(this, Network::class.java))
        }


    }
    }

