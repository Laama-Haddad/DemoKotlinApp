package com.example.demologin

data class Product (
    val title: String,
    var price: Double,
    var amount: Int
        ){
    fun applyDiscount(discountPercent: Int){
        if(amount in 1..5){
            price-=(price*discountPercent/100)
        }
    }
}