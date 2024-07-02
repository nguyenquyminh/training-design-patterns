package com.example.builder.model;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer.Builder builder;

    public GamingComputerBuilder() {
        this.builder = new Computer.Builder();
    }
    @Override
    public void buildCPU() {
        builder.CPU("Intel i7");
    }

    @Override
    public void buildRAM() {
        builder.RAM("32GB");
    }

    @Override
    public void buildSSD() {
        builder.SSD("1TB SSD");
    }
    @Override
    public void buildHDD() {
    }

    @Override
    public void buildGraphicsCard() {
        builder.graphicsCard("NVIDIA RTX 4090");
    }

    @Override
    public void buildPowerSupply() {
        builder.powerSupply("850W Corsair");
    }

    @Override
    public Computer getComputer() {
        return builder.build();
    }
}
