package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_chat.*


class Chat : AppCompatActivity() {

    private var adapter: ChatListAdapter? = null
    private var chatList: ArrayList<Chats>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        chatList = ArrayList<Chats>()
        layoutManager = LinearLayoutManager(this)
        adapter = ChatListAdapter(chatList!!, this)


        //setup list ( Recyclerview
        chats_recycler_view.layoutManager = layoutManager
        chats_recycler_view.adapter = adapter


        //load data
        for (i in 0..16) {
            val chats = Chats()
            chats.name = "James" + i
            chats.message =  "James" + i
            chatList!!.add(chats)


        }
        adapter!!.notifyDataSetChanged()

    }
}


