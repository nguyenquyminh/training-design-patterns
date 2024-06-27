package com.example.adapter.musicadapter;

import com.example.adapter.domain.MusicPlayer;
import com.example.adapter.domain.OggPlayer;

public class OggAdapter implements MusicPlayer {
    private OggPlayer oggPlayer = new OggPlayer();

    public OggAdapter() {}

    @Override
    public void playMusic(String fileName) {
        oggPlayer.playOgg(fileName);
    }
}
