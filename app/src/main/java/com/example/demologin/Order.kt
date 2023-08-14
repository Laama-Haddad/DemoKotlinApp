package com.example.demologin

class Order (val amountBeforeTax : Int) {
    companion object{
        const val TAX_PERCENTAGE =5
        fun getNetOrderAmount(orderAmount: Int): Double {
            return orderAmount + (orderAmount * TAX_PERCENTAGE / 100.0)
        }
    }
}