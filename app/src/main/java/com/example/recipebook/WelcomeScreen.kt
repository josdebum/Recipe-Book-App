package com.example.recipebook


import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_welcome_screen.*


class WelcomeScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        createAccount.setOnClickListener {
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }

        val email = "example@gmail.com"
        val password = "demoPassword"
        FirebaseAuth.getInstance()
            .signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this, { task: Task<AuthResult> ->


            })


        fun isLoggedIn() = FirebaseAuth.getInstance().currentUser != null

        if (isLoggedIn()) {
            // Show logout page
        } else {
            // Show login page
        }
    }
}