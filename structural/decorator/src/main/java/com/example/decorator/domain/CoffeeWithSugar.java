package com.example.decorator.domain;

public class CoffeeWithSugar implements Coffee {
    @Override
    public double getCost() {
        return 2.30;
    }

    @Override
    public String getIngredients() {
        return "Coffee, Sugar";
    }
}
