package com.luppi.payment_gateway_api.gateway.stripe

import com.luppi.payment_gateway_api.domain.dto.ChargeRequest
import com.luppi.payment_gateway_api.domain.dto.ChargeResponse
import com.luppi.payment_gateway_api.gateway.common.IPaymentGateway
import org.springframework.stereotype.Component
import java.util.UUID

@Component("stripe")
class StripeMockGateway : IPaymentGateway {
    override val name = "stripe"

    override fun charge(request: ChargeRequest): ChargeResponse {
        return ChargeResponse(
            success = true,
            transactionId = UUID.randomUUID().toString(),
            message = "Stripe mock payment successful"
        )
    }
}