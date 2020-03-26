package com.AOPdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Springde {

	public static void main(String[] args) 
	{
		ApplicationContext cont = new AnnotationConfigApplicationContext(AppConfig.class);
		Alien a1 = cont.getBean(Alien.class);
		a1.show();
	}
}
