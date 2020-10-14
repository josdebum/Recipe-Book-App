package com.example.recipebook

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_create_account.*


class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)


        val one: String = Email.text.toString().trim()
        val two: String = password.text.toString().trim()
        val PhoneNumber = findViewById<EditText>(R.id.phoneNumber)
        val CreateAccount = findViewById<Button>(R.id.create_button)
        val ProgressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val fAuth = FirebaseAuth.getInstance()




        create_button.setOnClickListener(View.OnClickListener() {
            @Override
            fun onClick(view: TextView) {



            if (TextUtils.isEmpty(Email.text.toString())){
                Email?.error = ("Email is required.")
            }
            if (TextUtils.isEmpty(password.text.toString())){
                password?.error = ("Password is required!")

            }
            if (password.length() <6){
                password?.error = ("Password must be >= 6 characters!")

            }
            progress_bar.visibility = View.VISIBLE

            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(one, two).addOnCompleteListener(this) { task: Task<AuthResult> ->
                    @Override
                    fun onComplete(@NonNull task: Task<AuthResult> ){

                    if (task.isSuccessful()){
                        Toast.makeText(this, "User has been created.", Toast.LENGTH_LONG).show()

                       startActivity(Intent(this, Home::class.java))
                    } else {
                        Toast.makeText(this, "Error has occurred", Toast.LENGTH_LONG).show()


                    }


                }


        }




}

            if (fAuth.currentUser != null) {
                startActivity(Intent(applicationContext, Home::class.java))

            }
        })


        fun String.isEmailValid() = android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()

// Usage
        "example@gmail.com".isEmailValid() // Return true
        "example@!?!?.com".isEmailValid() // Return false
    }}