package com.example.command.newservice.invoker;

import com.example.command.domain.GarageDoor;
import com.example.command.domain.Light;
import com.example.command.newservice.command.Command;
import com.example.command.newservice.command.GarageDoorCloseCommand;
import com.example.command.newservice.command.GarageDoorOpenCommand;
import com.example.command.newservice.command.LightOffCommand;
import com.example.command.newservice.command.LightOnCommand;

public class RemoteControl {
    private Command command;
    private Light light = new Light();
    private GarageDoor garageDoor = new GarageDoor();

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton(String deviceAction) {
        if (deviceAction.equals("LightOn")) {
            command = new LightOnCommand(light);
        } else if (deviceAction.equals("LightOff")) {
           command = new LightOffCommand(light);
        } else if (deviceAction.equals("GarageOpen")) {
            command = new GarageDoorOpenCommand(garageDoor);
        } else if (deviceAction.equals("GarageClose")) {
            command = new GarageDoorCloseCommand(garageDoor);
        }
        command.execute();
    }
}
