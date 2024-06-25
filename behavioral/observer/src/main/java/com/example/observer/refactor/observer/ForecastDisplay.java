package com.example.observer.refactor.observer;


import com.example.observer.refactor.subject.WeatherStation;

public class ForecastDisplay extends Observer {

  private WeatherStation weatherStation;

  public ForecastDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
  }

  @Override
  public void update() {
    double pressure = weatherStation.getPressure();
    String forecast = pressure > 30.0 ? "Weather looks good!" : "Possible rain coming.";
    System.out.println("Forecast: " + forecast);
  }
}
