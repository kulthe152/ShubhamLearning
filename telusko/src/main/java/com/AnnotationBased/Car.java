package com.AnnotationBased;

import org.springframework.stereotype.Component;


@Component
public class Car implements vehical
{
	public void drive()
	{
		System.out.println("carrrrrrrrrr.....");
	}
}
