package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test 
{

	public static void main(String[] args) 
	{
		// 1. Arraylist using generics
		
		ArrayList<Emp> e1 = new ArrayList<Emp>();
		e1.add(new Emp(111,"sk"));
		e1.add(new Emp(222,"kp"));
		for(Emp e : e1)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		
		String n1 = "Shubham";
		String n2 = "Shubham";
		
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
	}
}
