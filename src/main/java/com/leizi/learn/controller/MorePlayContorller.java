package com.leizi.learn.controller;

import com.leizi.learn.service.MorePlay;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
 
@Component
public class MorePlayContorller {
 
    private MorePlay morePlay;

    //用Qualifier指定具体的bean name,或者构造函数中的属性名与所要注入的bean名称一致,否则会报错
    public MorePlayContorller(@Qualifier("morePlayImplFirstOne")MorePlay morePlay) {
        morePlay.someOnePlay();
    }
 
}