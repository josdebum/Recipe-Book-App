package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.notification_list.*


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






        notificationList!!.add(Notification("Adebayo Apercu sent you a message", "Yesterday"))

        notificationList!!.add(Notification("Oladele Tamilore replied your message", "Monday 22 October"))

        notificationList!!.add(Notification("20 people added your recipe as a favourite", "Friday 19 October"))

        notificationList!!.add(Notification("Adebayo Apercu sent you a message", "Yesterday"))

        notificationList!!.add(Notification("Oladele Tamilore replied your message", "Monday 22 October"))

        notificationList!!.add(Notification("20 people added your recipe as a favourite", "Friday 19 Oct"))
        notificationList!!.add(Notification("Adebayo Apercu sent you a message", "Yesterday"))

        notificationList!!.add(Notification("Oladele Tamilore replied your message", "Monday 22 October"))

        notificationList!!.add(Notification("20 people added your recipe as a favourite", "Friday 19 Oct"))

        notificationList!!.add(Notification("Adebayo Apercu sent you a message", "Yesterday"))

        notificationList!!.add(Notification("Oladele Tamilore replied your message", "Monday 22 October"))

        notificationList!!.add(Notification("20 people added your recipe as a favourite", "Friday 19 Oct"))






//            notification.message_by = "Oladele Tamilore replied your message"
//            notification.date =  "Monday 22 October"
//           // notificationList!!.add(notification)
//
//            notification.message_by = "20 people added your recipe as a favourite"
//            notification.date =  "Friday 19 October"
//            notificationList!!.add(notification)












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

