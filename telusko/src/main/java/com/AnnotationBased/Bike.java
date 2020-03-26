package com.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehical
{
	public void drive()
	{
		System.out.println("Bhuuuuuungggg");
	}
}
