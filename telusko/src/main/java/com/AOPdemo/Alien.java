package com.AOPdemo;

import org.springframework.stereotype.Component;

@Component
public class Alien 
{
	public void show()
	{		
		System.out.println("hello world");
	}
	
	public void display()
	{		
		System.out.println("display method");
	}
}
 