package com.example.demo;

public class Human {

    int age;

    public Human(){
        System.out.println("Human object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public void code(){
//        System.out.println("Coding...");

    }
}
