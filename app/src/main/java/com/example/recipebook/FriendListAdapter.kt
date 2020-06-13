package com.example.recipebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.FriendListAdapter.ViewHolder
import kotlinx.android.synthetic.main.frienditem.*

class FriendListAdapter (private val list: ArrayList<Friend>,
                         private val context: Context) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.frienditem, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.bindItem(list[position])


    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(friend : Friend) {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var no_of_friends: TextView = itemView.findViewById(R.id.no_of_friends) as TextView

            name.text = friend.name
            no_of_friends.text = friend.no_of_friends.toString()




            itemView.setOnClickListener {


                }
            }

        }

    }
