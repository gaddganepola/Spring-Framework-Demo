package com.springframework;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private int salary;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien Created..");
    }

    public Alien(int age) {
        this.age = age;
        System.out.println("age constructor called...");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
        System.out.println("age and lap constructor called...");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @ConstructorProperties({"age", "salary", "lap"})
    public Alien(int age, int salary, Laptop lap) {
        this.age = age;
        this.salary = salary;
        this.lap = lap;
        System.out.println("All constructor called...");
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
