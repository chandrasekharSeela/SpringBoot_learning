package com.chandralearing.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SupperContraGame implements GamingConsole{

    public void up(){
        System.out.println("Contra Jump");
    }
    public void down(){
        System.out.println("Contra Bend");
    }

    public void left(){
        System.out.println("Contra Go left");
    }

    public void right(){
        System.out.println("Contra Go Right");
    }
}
