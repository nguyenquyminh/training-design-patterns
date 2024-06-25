package com.example.observer.refactor.subject;

import com.example.observer.refactor.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

  private double temperature;
  private double humidity;
  private double pressure;

  List<Observer> observers = new ArrayList<>();

  @Override
  public void attach(Observer observer) {
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }
  @Override
  public void notifyAllObserver() {
    observers.forEach(Observer::update);
  }

  public void setMeasurements(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyAllObserver();
  }

  public double getTemperature() {
    return temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public double getPressure() {
    return pressure;
  }
}
