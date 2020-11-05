package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        back_arrow.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }


        //setup list ( Recyclerview
        chats_recycler_view.layoutManager = layoutManager
        chats_recycler_view.adapter = adapter


        chatList!!.add(Chats("Adebayo Apercu", "A selection of chicken dishes served together ...", R.drawable.josdebum))

        chatList!!.add(Chats("Ronke Igboegwu", "A selection of chicken dishes served together ...", R.drawable.chat_image))

        chatList!!.add(Chats("Ekaite Akande", "A selection of chicken dishes served together ...", R.drawable.chat_image_2))
        chatList!!.add(Chats("\n" +
                "Adedunni Nwaneri", "A selection of chicken dishes served together ...", R.drawable.chat_image_3))

        chatList!!.add(Chats("Adebayo Apercu", "A selection of chicken dishes served together ...", R.drawable.josdebum))

        chatList!!.add(Chats("Ronke Igboegwu", "A selection of chicken dishes served together ...", R.drawable.chat_image))

        chatList!!.add(Chats("Ekaite Akande", "A selection of chicken dishes served together ...", R.drawable.chat_image_2))
        chatList!!.add(Chats("\n" +
                "Adedunni Nwaneri", "A selection of chicken dishes served together ...", R.drawable.chat_image_3))

        chatList!!.add(Chats("Adebayo Apercu", "A selection of chicken dishes served together ...", R.drawable.josdebum))

        chatList!!.add(Chats("Ronke Igboegwu", "A selection of chicken dishes served together ...", R.drawable.chat_image))

        chatList!!.add(Chats("Ekaite Akande", "A selection of chicken dishes served together ...", R.drawable.chat_image_2))
        chatList!!.add(Chats("\n" +
                "Adedunni Nwaneri", "A selection of chicken dishes served together ...", R.drawable.chat_image_3))


        //load data


    }
}


