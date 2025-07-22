package com.springframework;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compile using Desktop...");
    }
}
