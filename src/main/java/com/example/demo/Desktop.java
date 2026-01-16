package com.example.demo;

import org.springframework.stereotype.Component;

@Component("com")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop object is created");
    }

    public void compile(){
        System.out.println("Compiling... using Desktop");
    }
}
