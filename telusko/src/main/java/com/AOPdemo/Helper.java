package com.AOPdemo;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//advice -> what ->before,after
//pointcut -> where

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper 
{
	@Before("execution(public void show() ) ")
	public void log()
	{
		System.out.println("log show called");
	}	
}
