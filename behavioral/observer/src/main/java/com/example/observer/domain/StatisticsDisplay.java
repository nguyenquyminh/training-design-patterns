package com.example.observer.domain;

public class StatisticsDisplay {
    private WeatherStation weatherStation;
    private double maxTemp = 0.0;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        double temp = weatherStation.getTemperature();
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        System.out.println("Max temperature: " + maxTemp + "C");
    }
}
