package com.example.singleton;

import com.example.singleton.service.DBConnectionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
		DBConnectionService dbConnectionService = new DBConnectionService();
		dbConnectionService.updateDatabase();
	}

}
