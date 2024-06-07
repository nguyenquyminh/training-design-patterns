package com.example.decorator;

import com.example.decorator.domain.Coffee;
import com.example.decorator.domain.CoffeeWithMilkAndSugar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorApplication.class, args);
		Coffee coffee = new CoffeeWithMilkAndSugar();
		System.out.println("Ingredients: " + coffee.getIngredients());
		System.out.println("Cost: $" + coffee.getCost());
	}

}
