package com.example.adapter;

import com.example.adapter.domain.Mp3Player;
import com.example.adapter.domain.MusicPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);
        MusicPlayer musicPlayer = new Mp3Player();
        musicPlayer.playMusic("audio.mp3");
    }
}
