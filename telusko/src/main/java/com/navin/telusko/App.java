package com.navin.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main(String[] args)
    { 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	vehicle obj = (vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
