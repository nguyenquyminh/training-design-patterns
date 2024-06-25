package com.example.observer.refactor.observer;


import com.example.observer.refactor.subject.WeatherStation;

public class StatisticsDisplay extends Observer {

  private double maxTemp = 0.0;

  public StatisticsDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
  }

  @Override
  public void update() {
    double temp = weatherStation.getTemperature();
    if (temp > maxTemp) {
      maxTemp = temp;
    }
    System.out.println("Max temperature: " + maxTemp + "C");
  }
}
