package com.example.recipebook

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_welcome_screen.*


class CreateAccountActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    private val TAG = "CreateAccountActivity"
    private var etEmail: EditText? = null
    private var etPassword: EditText? = null
    private var btnCreateAccount: Button? = null
    private var mProgressBar: ProgressBar? = null
    private var mDatabaseReference: DatabaseReference? = null
    private var mDatabase: FirebaseDatabase? = null
    private var etFirstName: EditText? = null
    private var etLastName: EditText? = null

    private var email: String? = null
    private var password: String? = null
    private var firstName: String? = null
    private var lastName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        initialise()

/*
//        mAuth = FirebaseAuth.getInstance()
//
//
//
//
//        create_button.setOnClickListener() {
//
//            var addEmail = input_email.text.toString().trim()
//            var addPassword = input_password.text.toString().trim()
//
//
//            if (TextUtils.isEmpty(Email.text.toString())){
//                Email?.error = ("Email is required.")
//            }
//            if (TextUtils.isEmpty(password.text.toString())){
//                password?.error = ("Password is required!")
//
//            }
//            if (password.length() <6){
//                password?.error = ("Password must be >= 6 characters!")
//
//            }
//
//
//
//            mAuth!!.createUserWithEmailAndPassword( addEmail,addPassword).addOnCompleteListener(
//                this
//            ) { task: Task<AuthResult> ->
//                if (task.isSuccessful) {
//                    var user: FirebaseUser = mAuth!!.currentUser!!
//                    Log.d("User", user.email.toString())
//
//                    Toast.makeText(this, "User has been created.", Toast.LENGTH_LONG).show()
//
//                       startActivity(Intent(this, Home::class.java))
//                } else {
//                    Log.d("Error", task.toString())
//
//                    Toast.makeText(this, "Error has occurred", Toast.LENGTH_LONG).show()
//                }
//
//
//            }
//
//        }
//    }*/
    }

    private fun initialise() {

        firstName = etFirstName?.text.toString()
        lastName = etLastName?.text.toString()


        etEmail = findViewById<View>(R.id.email) as EditText
        etPassword = findViewById<View>(R.id.password) as EditText
        btnCreateAccount = findViewById<View>(R.id.btnCreateAccount) as Button
        mDatabase = FirebaseDatabase.getInstance()
        mDatabaseReference = mDatabase!!.reference.child("Users")
        mAuth = FirebaseAuth.getInstance()
        mProgressBar = findViewById<ProgressBar>(R.id.progress_bar);
        btnCreateAccount!!.setOnClickListener { createNewAccount() }
    }
    private fun createNewAccount() {

        email = etEmail?.text.toString()
        password = etPassword?.text.toString()

        if ( !TextUtils.isEmpty(firstName) && !TextUtils.isEmpty(lastName)
            && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
            mProgressBar!!.visibility = View.VISIBLE

            mAuth!!
                .createUserWithEmailAndPassword(email!!, password!!)
                .addOnCompleteListener(this) { task ->
                    mProgressBar!!.visibility = View.INVISIBLE
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("users" , "createUserWithEmail:success")
                        val userId = mAuth!!.currentUser!!.uid

                        startActivity(Intent(this, Home::class.java))
                        //Verify Email
                        //verifyEmail();
                        //update user profile information
                        val currentUserDb = mDatabaseReference!!.child(userId)
                        currentUserDb.child("firstName").setValue(firstName)
                        currentUserDb.child("lastName").setValue(lastName)

                        updateUserInfoAndUI()
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.d("Error", "createUserWithEmail:failure", task.exception)
                        Toast.makeText(this@CreateAccountActivity, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }


        } else {
            Toast.makeText(this, "Enter all details", Toast.LENGTH_SHORT).show()
        }

    }

    private fun updateUserInfoAndUI() {
        //start next activity
        val intent = Intent(this@CreateAccountActivity, Home::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

//    private fun verifyEmail() {
//        val mUser = mAuth!!.currentUser;
//        mUser!!.sendEmailVerification()
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(this@CreateAccountActivity,
//                        "Verification email sent to " + mUser.getEmail(),
//                        Toast.LENGTH_SHORT).show()
//                } else {
//                    Log.d("users", "sendEmailVerification", task.exception)
//                    Toast.makeText(this@CreateAccountActivity,
//                        "Failed to send verification email.",
//                        Toast.LENGTH_SHORT).show()
//                }
//            }
//    }
}