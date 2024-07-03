package com.example.observer.refactor.impl;

import com.example.observer.refactor.Observer;

public class StatisticsDisplay implements Observer {
    private double maxTemp = 0.0;
    @Override
    public void update(double temp, double humidity, double pressure) {
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        display();
    }

    public void display() {
        System.out.println("Max temperature: " + maxTemp + "C");
    }
}
