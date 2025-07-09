# 💳 Payment Gateway Abstraction API


A  unified API that abstract multiple payment providers (Stripe, Mercado Pago, etc.), allowing applications to make charges without worrying about the details of each gateway detail.

## Architecture

- Kotlin + Spring WebFlux for reactive programming and better performance
- Abstraction by interface for multiple payment providers
- Webhooks and Callbacks supported
- Structure and resilient logging with Retry and Circuit Breaker

```
Client --> POST /charge --> PaymentService
                                  |
                    --------------|--------------          
                    |                           |
              StripeAdapter              MercadoPagoAdapter
```

## How to run

```bash

git clone https://github.com/gabiluppi/payment-gateway-api
cd payment-gateway-api
./gradlew bootRun
```
- Requires Java 24, Docker, Gradle

Simulated Stripe and MercadoPago environments are mocked up with WireMock.

### Usage example

````http
POST /charge
Content-Type: application/json

{
    "provider": "stripe",
    "amount": 1000,
    "currency": "USD",
    "card": {
        "number": "4242424242424242",
        "expiration_month": 12,
        "expiration_year": 2025,
        "cvc": "123"
    }
}
````

### **Roadmap**

- [x] Implement gateway abstraction with common interface.
- [ ] Stripe support
- [ ] MercadoPago support
- [ ] Webhooks support
- [ ] Structured loggin + correlationId
- [ ] CI/CD with GitHub Actions
- [ ] Generate payment QR Code

## 📬 Contact

Created by [@gabiluppi](https://github.com/gabiluppi) • luppi.gabriel42@gmail.com

---

## 📝 License

Distributed  under the MIT license. See `LICENSE` for more information.