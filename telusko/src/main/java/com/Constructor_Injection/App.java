package com.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("constructor_spring.xml");
		Tyre t  = (Tyre)c.getBean("tyre");
		System.out.println(t);
	}

}
