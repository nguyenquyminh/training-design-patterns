package com.example.observer.refactor;


import com.example.observer.refactor.observer.ForecastDisplay;
import com.example.observer.refactor.observer.StatisticsDisplay;
import com.example.observer.refactor.observer.CurrentConditionsDisplay;
import com.example.observer.refactor.subject.WeatherStation;

public class Main {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.attach(new CurrentConditionsDisplay(weatherStation));
		weatherStation.attach(new StatisticsDisplay(weatherStation));
		weatherStation.attach(new ForecastDisplay(weatherStation));
		weatherStation.setMeasurements(32, 65, 30.4);
		weatherStation.setMeasurements(38, 70, 29.2);
	}

}
