package com.example.builder;

import com.example.builder.model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		Computer gamingComputer = new Computer("Intel i7", "32GB", null, "1TB SSD", "Nvidia RTX 4090", "850W Corsair");
		Computer officeComputer = new Computer("Intel i5", "8GB", "1TB HDD", null, null, "500W");
	}
}
