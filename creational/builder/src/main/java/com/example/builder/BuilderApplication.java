package com.example.builder;

import com.example.builder.model.Computer;
import com.example.builder.model.Director;
import com.example.builder.model.GamingComputerBuilder;
import com.example.builder.model.OfficeComputerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
//		Computer gamingComputer = new Computer("Intel i7", "32GB", null, "1TB SSD", "Nvidia RTX 4090", "850W Corsair");
//		Computer officeComputer = new Computer("Intel i5", "8GB", "1TB HDD", null, null, "500W");


//		Computer personalComputer = new Computer.Builder("Intel i9", "32GB")
//				.HDD("1TB")
//				.SSD("512GB")
//				.graphicsCard("Nvidia RTX 4090")
//				.powerSupply("850W")
//				.build();

//		Computer workingComputer = new Computer.Builder()
//				.CPU("Intel i3")
//				.RAM("4GB")
//				.HDD("500GB")
//				.build();

//		System.out.println("personalComputer: ");
//		System.out.println("CPU: " + com1.getCPU());
//		System.out.println("RAM: " + com1.getRAM());
//		System.out.println("HDD: " + com1.getHDD());
//		System.out.println("SSD: " + com1.getSSD());
//		System.out.println("Graphics Card: " + com1.getGraphicsCard());
//		System.out.println("Power Supply: " + com1.getPowerSupply());

//		System.out.println("personalComputer: ");
//		System.out.println("CPU: " + personalComputer.getCPU());
//		System.out.println("RAM: " + personalComputer.getRAM());
//		System.out.println("HDD: " + personalComputer.getHDD());
//		System.out.println("SSD: " + personalComputer.getSSD());
//		System.out.println("Graphics Card: " + personalComputer.getGraphicsCard());
//		System.out.println("Power Supply: " + personalComputer.getPowerSupply());
//
//		System.out.println("\nworkingComputer 2: ");
//		System.out.println("CPU: " + workingComputer.getCPU());
//		System.out.println("RAM: " + workingComputer.getRAM());
//		System.out.println("HDD: " + workingComputer.getHDD());
//		System.out.println("SSD: " + workingComputer.getSSD());

//		Lombok

//		Computer computer = Computer.builder()
//				.HDD("500")
//				.build();
//		System.out.println(computer);
//		Computer computer = new Computer.Builder()
//				.HDD("500")
//				.build();
//		System.out.println(computer);

		Director gamingDirector = new Director(new GamingComputerBuilder());
		Computer gamingComputer = gamingDirector.buildComputer();
		System.out.println("Gaming Computer: " + gamingComputer);

		Director officeDirector = new Director(new OfficeComputerBuilder());
		Computer officeComputer = officeDirector.buildComputer();
		System.out.println("Office Computer: " + officeComputer);


	}
}
