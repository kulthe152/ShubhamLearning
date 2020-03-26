package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("p");
		al.add("pq");
		al.add("pqr");
		al.add("pqrs");
		
		//read the data using normal enumeration
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		}
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String s1 = it.next();
			System.out.println(s1);
		}
	}
}
