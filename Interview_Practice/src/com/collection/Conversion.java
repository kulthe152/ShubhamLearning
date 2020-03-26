package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {

	public static void main(String[] args) 
	{
		// conversion of array to collection
		
		String s[] = {"abc","pqr","xyz"};
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(s));
		s1.add("shubham");
		s1.add("kulthe");
		System.out.println(s1);
		
		//conversion of generic collection to array
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("pallavi");
		sl.add("snehal");
		String[] ss = new String[sl.size()];
		sl.toArray(ss);
		for(String sss : ss)
		{
			System.out.println(sss);
		}
		
		//conversion of normal collection to array
		ArrayList al3 = new ArrayList();
		al3.add("skncc");
		al3.add("zibacar");
		Object[] o = al3.toArray();
		for(Object oo : o)
		{
			System.out.println(oo);
		}
	}
}
