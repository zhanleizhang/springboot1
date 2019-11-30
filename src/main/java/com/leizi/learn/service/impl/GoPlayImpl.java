package com.leizi.learn.service.impl;

import com.leizi.learn.service.GoPlay;
import org.springframework.stereotype.Component;

@Component
public class GoPlayImpl implements GoPlay {
    @Override
    public void havePlay() {
        System.out.println("\n\nsingle play\n\n");
    }
}