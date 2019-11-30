package com.leizi.learn.controller;

import com.leizi.learn.service.GoPlay;
import org.springframework.stereotype.Component;

@Component
public class PlayController {
    private GoPlay goPlay;

    public PlayController(GoPlay goPlay) {
        this.goPlay = goPlay;
    }

    public void play(){
        goPlay.havePlay();
    }
}