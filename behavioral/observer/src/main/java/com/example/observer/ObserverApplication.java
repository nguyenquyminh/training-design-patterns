package com.example.observer;

import com.example.observer.domain.WeatherStation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setMeasurements(32, 65, 30.4);
		weatherStation.setMeasurements(38, 70, 29.2);
	}

}
