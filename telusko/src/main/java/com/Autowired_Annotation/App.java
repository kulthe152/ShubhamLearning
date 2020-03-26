package com.Autowired_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("Autowired_spring.xml");
		Car ob = (Car)c.getBean("car");
		ob.drive();
	}
}
