package com.chandralearing.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();
}
