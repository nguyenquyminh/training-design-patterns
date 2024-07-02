package com.example.strategy;

import com.example.strategy.strategies.CreditCardPayment;
import com.example.strategy.strategies.CryptoPayment;
import com.example.strategy.strategies.PayPalPayment;
import com.example.strategy.strategies.PaymentStrategy;

public class PaymentProcessorStrategy {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public PaymentProcessorStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment strategy set.");
        }
    }
}