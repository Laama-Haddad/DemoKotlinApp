package com.example.demologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var emailET : TextInputEditText
    lateinit var passwordET : TextInputEditText
    lateinit var loginBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        loginBtn.setOnClickListener{
            val email=emailET.text.toString()
            val password=passwordET.text.toString()
            val myIntent = Intent(this,HomeActivity::class.java)
            myIntent.putExtra("email",email)
            myIntent.putExtra("password",password)
            startActivity(myIntent)
        }
    }
    private fun initializeViews(){
        emailET=findViewById(R.id.email_et)
        passwordET=findViewById(R.id.password_et)
        loginBtn=findViewById(R.id.login_btn)
    }
}