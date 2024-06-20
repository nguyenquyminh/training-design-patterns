package com.example.command.service;

import com.example.command.domain.GarageDoor;
import com.example.command.domain.Light;

public class RemoteControl {
    public void pressButton(String deviceAction) {
        if (deviceAction.equals("LightOn")) {
            Light light = new Light();
            light.on();
        } else if (deviceAction.equals("LightOff")) {
            Light light = new Light();
            light.off();
        } else if (deviceAction.equals("GarageOpen")) {
            GarageDoor garage = new GarageDoor();
            garage.open();
        } else if (deviceAction.equals("GarageClose")) {
            GarageDoor garage = new GarageDoor();
            garage.close();
        }
    }
}
