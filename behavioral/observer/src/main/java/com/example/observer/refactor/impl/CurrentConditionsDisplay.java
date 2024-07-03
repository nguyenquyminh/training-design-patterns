package com.example.observer.refactor.impl;

import com.example.observer.refactor.Observer;

public class CurrentConditionsDisplay implements Observer {
    private double temperature;
    private double humidity;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current condition: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
