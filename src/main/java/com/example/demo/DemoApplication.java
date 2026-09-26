package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		var OrderService = new OrderService(new StripePaymentService());
		System.out.println(OrderService.getOrderDetails());
		System.out.println(OrderService.processOrder(100.0));
	}

}
