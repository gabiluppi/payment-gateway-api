package com.luppi.payment_gateway_api.domain.dto

data class ChargeResponse(
    val success: Boolean,
    val transactionId: String,
    val message: String
)
