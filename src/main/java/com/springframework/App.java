package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        Alien obj;
//      Manually created object
//        obj = new Alien();

//        Use application context to create object
        ApplicationContext context = new ClassPathXmlApplicationContext();
        obj = (Alien)context.getBean("alien");

        obj.coding();

    }
}
