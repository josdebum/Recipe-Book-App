package com.example.recipebook


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_welcome_screen.*


class WelcomeScreen : AppCompatActivity() {
    private val TAG = "LoginActivity"
    private var mAuth: FirebaseAuth? = null
    private var currentUser: FirebaseUser? = null
    private var tvForgotPassword: TextView? = null
    private var email: String? = null
    private var password: String? = null
    private var btnLogin: Button? = null
    private var etEmail: EditText? = null
    private var etPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        initialise()








//        login.setOnClickListener() {
//
//            var inputEmail = input_email.text.toString().trim()
//            var inputPassword = input_password.text.toString().trim()
//
////                mAuth!!.signInWithEmailAndPassword(inputEmail, inputPassword).
////        addOnCompleteListener { task:Task<AuthResult> ->
//            if (inputEmail == "josephdeborah506@gmail.com" && inputPassword == "josdebum") {
//                startActivity(Intent(this, Home::class.java))
//            } else {
//                Toast.makeText(this, "Signed in not successful", Toast.LENGTH_LONG).show()
//            }
//        }




        // startActivity(Intent(this, MainScreen::class.java))
    }

    private fun initialise() {
        tvForgotPassword = findViewById<View>(R.id.tv_forgot_password) as TextView
        etEmail = findViewById<View>(R.id.et_email) as EditText
        etPassword = findViewById<View>(R.id.et_password) as EditText
        btnLogin = findViewById<View>(R.id.btn_login) as Button


        mAuth = FirebaseAuth.getInstance()
        tvForgotPassword!!
            .setOnClickListener { startActivity(Intent(this@WelcomeScreen,
                ForgetPasswordActivity::class.java)) }

        btnLogin!!.setOnClickListener { loginUser() }

        createAccount.setOnClickListener {
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }
    }

    private fun loginUser() {
        email = etEmail?.text.toString()
        password = etPassword?.text.toString()
        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {

            Log.d(TAG, "Logging in user.")
            mAuth!!.signInWithEmailAndPassword(email!!, password!!)
                .addOnCompleteListener(this) { task ->

                    if (task.isSuccessful) {
                        // Sign in success, update UI with signed-in user's information
                        Log.d(TAG, "signInWithEmail:success")
                        updateUI()
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.e(TAG, "signInWithEmail:failure", task.exception)
                        Toast.makeText(this@WelcomeScreen, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        } else {
            Toast.makeText(this, "Enter all details", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateUI() {
        val intent = Intent(this@WelcomeScreen, Home::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
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


