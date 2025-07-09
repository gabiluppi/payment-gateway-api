package com.luppi.payment_gateway_api.service

import com.luppi.payment_gateway_api.gateway.common.IPaymentGateway
import org.springframework.stereotype.Component

@Component
class PaymentGatewayResolver(
    private val gateways: List<IPaymentGateway>
) {
    private val gatewayMap = gateways.associateBy { it.name }

    fun resolve(provider: String): IPaymentGateway {
        return gatewayMap[provider] ?: throw IllegalArgumentException("Unsupported payment provider: $provider")
    }
}