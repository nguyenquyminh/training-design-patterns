package com.example.facade;

import com.example.facade.domain.Image;
import com.example.facade.service.ImageFilter;
import com.example.facade.service.ImageLoader;
import com.example.facade.service.ImageSaver;

public class ImageFacade {
    private final ImageLoader loader;
    private final ImageFilter filter;
    private final ImageSaver saver;

    public ImageFacade() {
        this.loader = new ImageLoader();
        this.filter = new ImageFilter();
        this.saver = new ImageSaver();
    }

    public void processImage(String inputPath, String outputPath) {
        // Load the image
        Image image = loader.load(inputPath);

        // Apply filters
        filter.applyBrightness(image);
        filter.applyContrast(image);

        // Save the image
        saver.save(image, outputPath);

    }
}
