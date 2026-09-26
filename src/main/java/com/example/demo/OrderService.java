package com.example.demo;

import org.springframework.stereotype.Service;

public class OrderService {
   
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String getOrderDetails() {
        return "Order details from OrderService";
    }

    public String processOrder(Double amount) {
        paymentService.processPayment(amount);
        return "Order processed with payment of amount: " + amount;
    }
}

