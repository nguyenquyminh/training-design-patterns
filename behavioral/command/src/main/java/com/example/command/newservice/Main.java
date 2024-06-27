package com.example.command.newservice;

import com.example.command.service.RemoteControl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.pressButton("LightOn");
		remoteControl.pressButton("LightOff");
	}

}
