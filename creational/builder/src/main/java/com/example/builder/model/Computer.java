package com.example.builder.model;

public class Computer {
    private String CPU;
    private String RAM;
    private String HDD;
    private String SSD;
    private String graphicsCard;
    private String powerSupply;

    public Computer(String CPU, String RAM, String HDD, String SSD, String graphicsCard, String powerSupply) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.SSD = SSD;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
    }

    public String getCPU() {
        return CPU;
    }

    public Computer setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public String getRAM() {
        return RAM;
    }

    public Computer setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public String getHDD() {
        return HDD;
    }

    public Computer setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    public String getSSD() {
        return SSD;
    }

    public Computer setSSD(String SSD) {
        this.SSD = SSD;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public Computer setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Computer setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }
}
