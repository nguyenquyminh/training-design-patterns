package com.example.facade.service;

import com.example.facade.domain.Image;

public class ImageSaver {
    public void save(Image image, String path) {
        System.out.println("Image saved to " + path);
    }
}
