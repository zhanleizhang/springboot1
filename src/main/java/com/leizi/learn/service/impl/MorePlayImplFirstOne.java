package com.leizi.learn.service.impl;

import com.leizi.learn.service.MorePlay;
import org.springframework.stereotype.Component;
 
@Component
public class MorePlayImplFirstOne implements MorePlay {
    @Override
    public void someOnePlay() {
        System.out.println("\n\nFirst one play.\n\n");
    }
}