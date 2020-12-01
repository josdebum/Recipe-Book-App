package com.example.recipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_friends.*
import kotlinx.android.synthetic.main.activity_opened_chat.*
import kotlinx.android.synthetic.main.activity_user_chat.*
import kotlinx.android.synthetic.main.chat_message_item_layout.*


class OpenedChat : AppCompatActivity() {
    lateinit var txtMessageBox: AppCompatEditText
    lateinit var btnSend: AppCompatImageView
    private var adapter: ChatAdapter? = null
    private var messageList: ArrayList<Message>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var getInput: EditText? = null
    private var input: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opened_chat)



        txtMessageBox = findViewById(R.id.txtMessageBox)
        btnSend = findViewById(R.id.imgSend)




        messageList = ArrayList()
        layoutManager = LinearLayoutManager(this)
        adapter = ChatAdapter(messageList!!, this)


        //setup list ( Recyclerview
        input_messages.layoutManager = layoutManager
        input_messages.adapter = adapter


        btnSend.setOnClickListener {
            sendMessage(txtMessageBox.text.toString())
        }
    }
//
//        txtMessageBox.setOnEditorActionListener { v, actionId, event ->
//            when(actionId)
//            {
//                EditorInfo.IME_ACTION_GO -> {
//                    sendMessage(txtMessageBox.text.toString())
//                    return@setOnEditorActionListener true
//                }
//            }
//            return@setOnEditorActionListener false
//        }}
//
//        // Send Button
//
         fun sendMessage(input_message: String) {
            if (!input_message.isEmpty()) {

                   // val messageText = message

                    var messageModel = Message(input_message, true)
                    messageList!!.add(messageModel)
                    adapter?.notifyItemInserted(messageList!!.size - 1)

                    // Clear the message box
                    txtMessageBox.setText("")

            }
        }


    }


