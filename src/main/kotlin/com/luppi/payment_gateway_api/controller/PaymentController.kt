package com.luppi.payment_gateway_api.controller

import com.luppi.payment_gateway_api.domain.dto.ChargeRequest
import com.luppi.payment_gateway_api.domain.dto.ChargeResponse
import com.luppi.payment_gateway_api.service.PaymentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/charge")
class PaymentController(
    private val service: PaymentService
) {
    @PostMapping
    fun charge(@RequestBody request: ChargeRequest) : Mono<ResponseEntity<ChargeResponse>> {
        return service.charge(request)
            .map { ResponseEntity.ok(it) }
    }
}