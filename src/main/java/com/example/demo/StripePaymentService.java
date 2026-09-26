package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class StripePaymentService implements PaymentService {

    public String processPayment(Double amount) {
        System.out.println("Processing payment of amount: " + amount + " through StripePaymentService");
        return "Payment of amount: " + amount + " processed through StripePaymentService";
    }
}