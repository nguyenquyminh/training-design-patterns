package com.example.observer.domain;

public class ForecastDisplay {
    private WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        double pressure = weatherStation.getPressure();
        String forecast = pressure > 30.0 ? "Weather looks good!" : "Possible rain coming.";
        System.out.println("Forecast: " + forecast);
    }
}
