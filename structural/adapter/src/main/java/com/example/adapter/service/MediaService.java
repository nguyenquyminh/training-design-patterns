package com.example.adapter.service;

import com.example.adapter.domain.Mp3Player;
import com.example.adapter.domain.MusicPlayer;
import com.example.adapter.musicadapter.OggAdapter;
import com.example.adapter.musicadapter.WavAdapter;

public class MediaService {
    public void playerMedia(String fileName){
        MusicPlayer musicPlayer = null;
        if(fileName.endsWith(".mp3")){
            musicPlayer = new Mp3Player();
        } else if(fileName.endsWith(".wav")){
            musicPlayer = new WavAdapter();
        } else if(fileName.endsWith(".ogg")){
            musicPlayer = new OggAdapter();
        }

        musicPlayer.playMusic(fileName);
    }
}
