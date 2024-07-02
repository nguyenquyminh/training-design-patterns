package com.example.builder.model;

public interface ComputerBuilder {
        void buildCPU();
        void buildRAM();
        void buildHDD();
        void buildSSD();
        void buildGraphicsCard();
        void buildPowerSupply();
        Computer getComputer();
}
