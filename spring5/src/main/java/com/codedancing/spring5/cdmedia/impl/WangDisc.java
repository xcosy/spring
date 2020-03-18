package com.codedancing.spring5.cdmedia.impl;

import com.codedancing.spring5.cdmedia.CompactDisc;
import org.springframework.stereotype.Component;

@Component
public class WangDisc implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Playing some songs by wang...");
    }

}
