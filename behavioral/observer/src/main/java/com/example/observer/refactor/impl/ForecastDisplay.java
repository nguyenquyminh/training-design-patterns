package com.example.observer.refactor.impl;

import com.example.observer.refactor.Observer;

public class ForecastDisplay implements Observer {
    private double pressure;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.pressure = pressure;
        display();
    }

    public void display() {
        String forecast = pressure > 30.0 ? "Weather looks good!" : "Possible rain coming.";
        System.out.println("Forecast: " + forecast);
    }
}
