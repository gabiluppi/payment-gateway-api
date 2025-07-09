package com.luppi.payment_gateway_api.domain.dto

data class ChargeRequest(
    val provider: String,
    val amount: Int,
    val currency: String,
    val card: CardInfo
)
