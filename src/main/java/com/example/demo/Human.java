package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {

    int age;
//    @Autowired
//    @Qualifier("com")
    private Computer com;

    public Human(){
        System.out.println("Human object created");
    }

//    public Human(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(@Qualifier("com") Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();

    }

}
