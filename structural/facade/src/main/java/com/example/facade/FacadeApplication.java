package com.example.facade;

import com.example.facade.domain.Image;
import com.example.facade.service.ImageFilter;
import com.example.facade.service.ImageLoader;
import com.example.facade.service.ImageSaver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacadeApplication.class, args);

		ImageLoader loader = new ImageLoader();
		ImageFilter filter = new ImageFilter();
		ImageSaver saver = new ImageSaver();

		// Loading the image
		Image image = loader.load("path/to/input.jpg");

		// Applying filters
		filter.applyBrightness(image);
		filter.applyContrast(image);

		// Saving the image
		saver.save(image, "path/to/output.jpg");

		System.out.println("Processing complete, image saved.");
	}

}
