package com.example.decorator.domain;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
