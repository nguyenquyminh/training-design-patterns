package com.example.observer.domain;

class CurrentConditionsDisplay {
    private WeatherStation weatherStation;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        double temp = weatherStation.getTemperature();
        double humidity = weatherStation.getHumidity();
        System.out.println("Current condition: " + temp + "C degrees and " + humidity + "% humidity");
    }
}
