package com.example.recipebook


import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_welcome_screen.*


class WelcomeScreen : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    private var currentUser: FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        createAccount.setOnClickListener {
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }


        mAuth = FirebaseAuth.getInstance()


        login.setOnClickListener() {

            var inputEmail = input_email.text.toString().trim()
            var inputPassword = input_password.text.toString().trim()

//                mAuth!!.signInWithEmailAndPassword(inputEmail, inputPassword).
//        addOnCompleteListener { task:Task<AuthResult> ->
            if (inputEmail == "josephdeborah506@gmail.com" && inputPassword == "josdebum") {
                startActivity(Intent(this, Home::class.java))
            } else {
                Toast.makeText(this, "Signed in not successful", Toast.LENGTH_LONG).show()
            }
        }


        // startActivity(Intent(this, MainScreen::class.java))
    }
}


//    override fun onStart (){
//        super.onStart ()
//        currentUser = mAuth!!.currentUser
//
//
//
//        if (currentUser != null){
//            Toast.makeText(this, "User is logged in", Toast.LENGTH_LONG).show()
//        }
//        else {
//            Toast.makeText(this, "User is logged out", Toast.LENGTH_LONG).show()
//        }}}

//}


