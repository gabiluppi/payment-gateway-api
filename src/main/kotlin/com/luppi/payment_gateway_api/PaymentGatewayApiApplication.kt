package com.luppi.payment_gateway_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymentGatewayApiApplication

fun main(args: Array<String>) {
	runApplication<PaymentGatewayApiApplication>(*args)
}
