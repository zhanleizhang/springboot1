package com.leizi.learn.test;

import com.leizi.learn.controller.PlayController;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayControllerTest {
    @Resource
    PlayController playController;

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void play() {
        playController.play();

    }
}