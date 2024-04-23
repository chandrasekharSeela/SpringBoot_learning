package com.chandralearing.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Your Bussiness clas
//Dependency 1 & 2
@Component
class YourBussinessClass {
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;


    @Override
    public String toString() {
        return "using{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Component
class Dependency1 {
    //@Autowired
    }




@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectonLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectonLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(  context.getBean(YourBussinessClass.class));

        }
    }
}
