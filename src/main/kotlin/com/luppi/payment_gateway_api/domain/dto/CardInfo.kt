package com.luppi.payment_gateway_api.domain.dto

data class CardInfo(
    val number: String,
    val expirationMonth: Int,
    val expirationYear: Int,
    val cvc: String
)
