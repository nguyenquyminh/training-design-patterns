package com.example.factory;

import com.example.factory.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
		NotificationService notificationService = new NotificationService();
		notificationService.notifyUser("ALERT", "This is an alert message");
	}

}
