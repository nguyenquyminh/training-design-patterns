package com.example.observer.refactor.observer;

import com.example.observer.refactor.subject.WeatherStation;

public abstract class Observer {

  WeatherStation weatherStation;

  public abstract void update();
}
