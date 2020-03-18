package com.codedancing.spring5.cdmedia.impl;

import com.codedancing.spring5.cdmedia.CompactDisc;
import com.codedancing.spring5.cdmedia.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

}