package com.example.decorator.domain;

public class CoffeeWithMilkAndSugar implements Coffee {
    @Override
    public double getCost() {
        return 2.80;
    }

    @Override
    public String getIngredients() {
        return "Coffee, Milk, Sugar";
    }
}
