package com.example.demologin

class TaxCalculator {
    companion object {
        val salesTaxPercentage: Double = 15.00
        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount: Double = 0.0
            for (orderItem in orderItemList) {
                orderAmount = orderAmount.plus(orderItem.price)
            }

            return orderAmount.times(salesTaxPercentage).div(100)
        }
    }
}