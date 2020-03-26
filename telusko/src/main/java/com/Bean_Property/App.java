package com.Bean_Property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext cont = new ClassPathXmlApplicationContext("BeanPropert_Spring.xml");
		Tyre t = (Tyre) cont.getBean("tyre");
		System.out.println(t);
	}

}
