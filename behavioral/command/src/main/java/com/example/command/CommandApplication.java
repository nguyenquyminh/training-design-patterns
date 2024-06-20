package com.example.command;

import com.example.command.service.RemoteControl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandApplication.class, args);
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.pressButton("LightOn");
		remoteControl.pressButton("LightOff");
	}

}
