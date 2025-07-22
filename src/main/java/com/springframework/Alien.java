package com.springframework;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private int salary;
    private Computer com;

    public Alien() {
        System.out.println("Alien Created..");
    }

    public Alien(int age) {
        this.age = age;
        System.out.println("age constructor called...");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("age and lap constructor called...");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @ConstructorProperties({"age", "salary", "com"})
    public Alien(int age, int salary, Computer com) {
        this.age = age;
        this.salary = salary;
        this.com = com;
        System.out.println("All constructor called...");
    }

    public void coding() {
        System.out.println("Coding.....");
        com.compile();
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called...");
        this.age = age;
    }
}
