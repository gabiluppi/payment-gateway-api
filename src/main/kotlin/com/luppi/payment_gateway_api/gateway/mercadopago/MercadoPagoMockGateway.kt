package com.luppi.payment_gateway_api.gateway.mercadopago

import com.luppi.payment_gateway_api.domain.dto.ChargeRequest
import com.luppi.payment_gateway_api.domain.dto.ChargeResponse
import com.luppi.payment_gateway_api.gateway.common.IPaymentGateway
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class MercadoPagoMockGateway : IPaymentGateway {
    override val name = "mercadopago"

    override fun charge(request: ChargeRequest): ChargeResponse {
        return ChargeResponse(
            success = true,
            transactionId = UUID.randomUUID().toString(),
            message = "MercadoPago mock payment successful"
        )
    }
}