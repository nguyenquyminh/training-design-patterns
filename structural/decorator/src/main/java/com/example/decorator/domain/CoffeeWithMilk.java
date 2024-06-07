package com.example.decorator.domain;

public class CoffeeWithMilk implements Coffee {
    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public String getIngredients() {
        return "Coffee, Milk";
    }
}
