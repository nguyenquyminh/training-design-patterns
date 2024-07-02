package com.example.strategy.strategies;

public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}
