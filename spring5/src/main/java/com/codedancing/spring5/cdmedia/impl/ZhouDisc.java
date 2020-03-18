package com.codedancing.spring5.cdmedia.impl;

import com.codedancing.spring5.cdmedia.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZhouDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-track: " + track);
        }
    }

}
