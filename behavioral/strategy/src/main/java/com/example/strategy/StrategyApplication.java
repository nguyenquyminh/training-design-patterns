package com.example.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);
		PaymentProcessor processor = new PaymentProcessor("CreditCard");
		processor.processPayment(100);

		processor = new PaymentProcessor("PayPal");
		processor.processPayment(200);

		processor = new PaymentProcessor("Crypto");
		processor.processPayment(300);
	}

}
