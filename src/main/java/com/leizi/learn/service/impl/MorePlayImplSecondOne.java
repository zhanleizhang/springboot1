package com.leizi.learn.service.impl;

import com.leizi.learn.service.MorePlay;
import org.springframework.stereotype.Component;
 
@Component
public class MorePlayImplSecondOne implements MorePlay {
    @Override
    public void someOnePlay() {
        System.out.println("\n\nSecond one play.\n\n");
    }
}