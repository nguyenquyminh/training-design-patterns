package com.example.facade.service;

import com.example.facade.domain.Image;

public class ImageLoader {
    public Image load(String path) {
        System.out.println("Image loaded from " + path);
        return new Image();
    }
}
