package com.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) 
	{
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring_Anno.xml");
		vehical obj = (vehical)context1.getBean("car");
		obj.drive();
	}

}
