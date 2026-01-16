package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Human {

    int age;
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

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();

    }

}
