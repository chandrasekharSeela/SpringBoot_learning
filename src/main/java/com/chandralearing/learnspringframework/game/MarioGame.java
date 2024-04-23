package com.chandralearing.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("Mario Jump");
    }
    public void down(){
        System.out.println("Mario Bend");
    }

    public void left(){
        System.out.println("Mario Move left");
    }

    public void right(){
        System.out.println("Mario Move Right");
    }
}
