package com.example.builder.model;

public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildComputer() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildSSD();
        builder.buildHDD();
        builder.buildGraphicsCard();
        builder.buildPowerSupply();
        return builder.getComputer();
    }
    public Computer buildAComputer() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildSSD();
        builder.buildHDD();
        return builder.getComputer();
    }
}