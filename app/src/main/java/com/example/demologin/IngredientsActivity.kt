package com.example.demologin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IngredientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredients)
        val dishKey=intent.getStringExtra(EXTRA_DISH_NAME_KEY)
        findViewById<TextView>(R.id.textView).text=when (dishKey){
            "burger"-> "tomato\nmeat"
            "pizza"->"parmasen\npasta"
            else-> "unknown"
        }
    }
    companion object{
        const val EXTRA_DISH_NAME_KEY="DishName"
        fun start(context: Context, dishName:String){
            val intent= Intent(context,IngredientsActivity::class.java)
            intent.putExtra(EXTRA_DISH_NAME_KEY,dishName)
            context.startActivity(intent)
        }
    }
}