package com.example.adapter.domain;

public class Mp3Player implements MusicPlayer {
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}
