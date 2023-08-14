package com.example.demologin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var emailET: TextInputEditText
    lateinit var passwordET: TextInputEditText
    lateinit var loginBtn: Button
    lateinit var burgerBtn: Button
    lateinit var pastaBtn: Button
    val TAG = "Main Laama"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
//        loginBtn.setOnClickListener{
//            val email=emailET.text.toString()
//            val password=passwordET.text.toString()
//            val myIntent = Intent(this,HomeActivity::class.java)
//            myIntent.putExtra("email",email)
//            myIntent.putExtra("password",password)
//            startActivity(myIntent)
//        }
//        val orderItemsList = listOf(
//            OrderItem("Burger", 8.00), OrderItem("Fries", 4.00), OrderItem("Soda", 2.00)
//        )
//        var taxAmount : Double = 0.0
//        taxAmount=TaxCalculator.getTaxAmountForOrderItems(orderItemsList)
//        Log.d(TAG, taxAmount.toString())

//        Log.d(TAG, Order.getNetOrderAmount(500.0).toString())
//        val order = Order(500)
//        val netAmount=Order.getNetOrderAmount(order.amountBeforeTax)
//        Log.d(TAG,netAmount.toString())
        burgerBtn.setOnClickListener{
            IngredientsActivity.start(this,"burger")
        }
        pastaBtn.setOnClickListener{
            IngredientsActivity.start(this,"pasta")
        }

    }


    private fun initializeViews() {
        emailET = findViewById(R.id.email_et)
        passwordET = findViewById(R.id.password_et)
        loginBtn = findViewById(R.id.login_btn)
        burgerBtn = findViewById(R.id.burgerBtn)
        pastaBtn = findViewById(R.id.pastaBtn)
    }
}

@Composable
fun SimpleUI(onClick:()->Unit){
    Button(onClick=onClick){
        Text(text="Button")
    }
}


