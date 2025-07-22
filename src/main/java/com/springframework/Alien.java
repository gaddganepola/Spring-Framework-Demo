package com.springframework;

public class Alien {

    private int age;
    private Laptop lap = new Laptop();

    public Alien() {
        System.out.println("Alien Created..");
    }

    public void coding() {
        System.out.println("Coding.....");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called...");
        this.age = age;
    }
}
