package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        addNotifications()

        notification_list.layoutManager = LinearLayoutManager(this)
        notification_list.adapter = NotificationAdapter(animals, this)
    }

        fun addNotifications() {
            animals.add("dog")
            animals.add("cat")
            animals.add("owl")
        }
    }

