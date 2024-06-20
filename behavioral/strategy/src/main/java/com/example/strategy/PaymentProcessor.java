package com.example.strategy;

public class PaymentProcessor {
    private String paymentType;

    public PaymentProcessor(String paymentType) {
        this.paymentType = paymentType;
    }

    public void processPayment(int amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentType.equals("Crypto")) {
            System.out.println("Processing cryptocurrency payment of $" + amount);
        } else {
            System.out.println("Invalid payment method");
        }
    }
}
