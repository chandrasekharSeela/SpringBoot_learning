package com.chandralearing.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

    public void up(){
        System.out.println("PacMan Jump");
    }
    public void down(){
        System.out.println("PacMan Bend");
    }

    public void left(){
        System.out.println("PacMan Go left");
    }

    public void right(){
        System.out.println("PacMan Go Right");
    }
}
