package com.example.demologin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var callActionBtn: Button
    lateinit var sendActionBtn: Button
    lateinit var browsingActionBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initializeViews()

        callActionBtn.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:0509036118")
            if (callIntent.resolveActivity(packageManager) == null) {
                startActivity(callIntent)
            } else {
                Toast.makeText(this,"No Activity found handle this",Toast.LENGTH_SHORT)
            }
        }
        sendActionBtn.setOnClickListener {
            val sendIntent = Intent(Intent.ACTION_SENDTO)
            sendIntent.data = Uri.parse("mailto:")
            sendIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("lolo@gmail.com"))
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Invitation")
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Invitation Text")
            if (sendIntent.resolveActivity(packageManager) !== null) {
                startActivity(sendIntent)
            } else {
                Toast.makeText(this,"No Activity found handle this",Toast.LENGTH_SHORT)
            }
        }
        browsingActionBtn.setOnClickListener {
            val browsingIntent = Intent(Intent.ACTION_VIEW)
            browsingIntent.data = Uri.parse("https://www.google.com")
            browsingIntent.setPackage("com.android.chrome")
            if (browsingIntent.resolveActivity(packageManager) !== null) {
                startActivity(browsingIntent)
            } else {
                Toast.makeText(this,"No Activity found handle this",Toast.LENGTH_SHORT)
            }
        }
        val userEmail = intent.getStringExtra("email")
        val userPassword = intent.getStringExtra("password")
        val message = "Hello : \n Your Email :  $userEmail \n Your Password :  $userPassword"
        tv.text = message
    }

    private fun initializeViews() {
        tv = findViewById(R.id.text_view)
        callActionBtn = findViewById(R.id.call_btn)
        sendActionBtn = findViewById(R.id.msg_btn)
        browsingActionBtn = findViewById(R.id.browser_btn)
    }
}