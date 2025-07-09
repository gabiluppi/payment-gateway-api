package com.luppi.payment_gateway_api.gateway.common

import com.luppi.payment_gateway_api.domain.dto.ChargeRequest
import com.luppi.payment_gateway_api.domain.dto.ChargeResponse

interface IPaymentGateway {
    val name: String
    fun charge(request: ChargeRequest): ChargeResponse
}