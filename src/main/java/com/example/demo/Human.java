package com.example.demo;

public class Human {

    int age;

    private Laptop lap;

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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();

    }





}
