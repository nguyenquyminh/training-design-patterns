package com.example.facade.service;

import com.example.facade.domain.Image;

public class ImageFilter {
    public void applyBrightness(Image image) {
        System.out.println("Brightness filter applied");
    }

    public void applyContrast(Image image) {
        System.out.println("Contrast filter applied");
    }
}
