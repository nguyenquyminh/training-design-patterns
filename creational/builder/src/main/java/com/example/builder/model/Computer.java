package com.example.builder.model;

import lombok.Builder;
import lombok.ToString;

@Builder
public class Computer {
    private String CPU;
    private String RAM ;
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

    Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.SSD = builder.SSD;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
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
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", HDD=" + HDD + ", SSD=" + SSD +
                ", graphicsCard=" + graphicsCard + ", powerSupply=" + powerSupply + "]";
    }
    public static class Builder {
        private String CPU;
        private String RAM;
        private String HDD;
        private String SSD;
        private String graphicsCard;
        private String powerSupply;

        public Builder() {
        }
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder HDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder SSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder powerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
