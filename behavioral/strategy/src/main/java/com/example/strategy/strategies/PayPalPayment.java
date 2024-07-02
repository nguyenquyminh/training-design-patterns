package com.example.strategy.strategies;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
