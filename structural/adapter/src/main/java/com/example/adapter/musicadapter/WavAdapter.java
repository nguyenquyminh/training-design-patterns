package com.example.adapter.musicadapter;

import com.example.adapter.domain.MusicPlayer;
import com.example.adapter.domain.WavPlayer;

public class WavAdapter implements MusicPlayer {
    private WavPlayer wavPlayer = new WavPlayer();

    public WavAdapter() {
    }

    @Override
    public void playMusic(String fileName) {
        wavPlayer.playWav(fileName);
    }
}

