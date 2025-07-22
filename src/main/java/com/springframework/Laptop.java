package com.springframework;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Created..");
    }

    @Override
    public void compile() {
        System.out.println("Compile using Laptop...");
    }
}
