package com.example.singleton;

import com.example.singleton.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {
	
	private final UserService userService;

	public SingletonApplication(UserService userService) {
		this.userService = userService;
	}

	@PostConstruct
	public void runQueries() {
		userService.getUsers();
		userService.addUser();
		userService.updateUser();
	}

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
	}

}
