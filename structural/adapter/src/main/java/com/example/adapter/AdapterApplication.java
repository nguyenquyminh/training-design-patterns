package com.example.adapter;

import com.example.adapter.domain.Mp3Player;
import com.example.adapter.domain.MusicPlayer;
import com.example.adapter.musicadapter.OggAdapter;
import com.example.adapter.service.MediaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);

        MediaService mediaService = new MediaService();
        mediaService.playerMedia("audio.wav");
    }
}
