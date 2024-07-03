package com.example.observer;

import com.example.observer.refactor.impl.CurrentConditionsDisplay;
import com.example.observer.refactor.impl.ForecastDisplay;
import com.example.observer.refactor.impl.StatisticsDisplay;
import com.example.observer.refactor.impl.WeatherStation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
//		WeatherStation weatherStation = new WeatherStation();
//		weatherStation.setMeasurements(32, 65, 30.4);
//		weatherStation.setMeasurements(38, 70, 29.2);

		WeatherStation refactoredWeatherStation = new WeatherStation();
		refactoredWeatherStation.registerObserver(new CurrentConditionsDisplay());
		refactoredWeatherStation.registerObserver(new StatisticsDisplay());
		refactoredWeatherStation.registerObserver(new ForecastDisplay());
		refactoredWeatherStation.setMeasurements(32, 65, 30.4);
		refactoredWeatherStation.setMeasurements(38, 70, 29.2);
	}

}
