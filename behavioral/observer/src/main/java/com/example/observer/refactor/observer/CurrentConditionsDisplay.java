package com.example.observer.refactor.observer;


import com.example.observer.refactor.subject.WeatherStation;

public class CurrentConditionsDisplay extends Observer {

  public CurrentConditionsDisplay(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
  }

  @Override
  public void update() {
    double temp = weatherStation.getTemperature();
    double humidity = weatherStation.getHumidity();
    System.out.println("Current condition: " + temp + "C degrees and " + humidity + "% humidity");
  }
}
