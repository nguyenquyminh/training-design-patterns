package com.example.builder.model;

public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer.Builder builder;

    public OfficeComputerBuilder() {
        this.builder = new Computer.Builder();
    }

    @Override
    public void buildCPU() {
        builder.CPU("Intel i5");
    }

    @Override
    public void buildRAM() {
        builder.RAM("8GB");
    }

    @Override
    public void buildHDD() {
        builder.HDD("500GB");

    }

    @Override
    public void buildSSD() {
    }

    @Override
    public void buildGraphicsCard() {
    }

    @Override
    public void buildPowerSupply() {
        builder.powerSupply("500W");
    }

    @Override
    public Computer getComputer() {
        return builder.build();
    }
}
