package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        Alien obj;
//        Manually created object
//        obj = new Alien();

//        Use application context to create object
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        obj = (Alien) context.getBean("alien");
//        obj.setAge(10);
        System.out.println("Age" + obj.getAge());
        System.out.println("Salary" + obj.getSalary());
        obj.coding();

//        Alien obj1 = (Alien) context.getBean("alien");
//        System.out.println(obj1.getAge());
//        obj1.coding();
//
//        Laptop objlap1 = (Laptop) context.getBean(Laptop.class);
//        objlap1.compile();
//
//        Laptop objlap2 = (Laptop) context.getBean(Laptop.class);
//        objlap2.compile();
    }
}
