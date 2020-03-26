package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_demo {

	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<String>();
		v1.add("a");
		v1.add("ab");
		v1.add("abc");
		v1.add("abcd");
		
		//read the data using normal enumeration
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
			String s1 = (String)e.nextElement();
			System.out.println(s1);
		}
		
		//read the data using generics enumeration
		System.out.println("\nusing generic ");
		Enumeration<String> e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			String s2 = e1.nextElement();
			System.out.println(s2);
		}
	}

}
