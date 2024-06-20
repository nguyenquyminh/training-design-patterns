package com.example.observer.domain;

public class WeatherStation {
    private CurrentConditionsDisplay currentDisplay;
    private StatisticsDisplay statsDisplay;
    private ForecastDisplay forecastDisplay;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        currentDisplay = new CurrentConditionsDisplay(this);
        statsDisplay = new StatisticsDisplay(this);
        forecastDisplay = new ForecastDisplay(this);
    }

    public void measurementsChanged() {
        currentDisplay.update();
        statsDisplay.update();
        forecastDisplay.update();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
    public double getPressure() { return pressure; }
}
