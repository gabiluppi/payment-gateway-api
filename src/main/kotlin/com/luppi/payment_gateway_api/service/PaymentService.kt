package com.luppi.payment_gateway_api.service

import com.luppi.payment_gateway_api.domain.dto.ChargeRequest
import com.luppi.payment_gateway_api.domain.dto.ChargeResponse
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PaymentService(
    private val resolver: PaymentGatewayResolver
) {
    fun charge(request: ChargeRequest): Mono<ChargeResponse> {
        val gateway = resolver.resolve(request.provider)
        return Mono.just(gateway.charge(request))
    }
}