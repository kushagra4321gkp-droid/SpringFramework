package com.example.demo;

public class Human {

    private int age;

    public Human(){
        System.out.println("Human object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Coding...");
    }
}
