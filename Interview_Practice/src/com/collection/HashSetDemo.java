package com.collection;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		
		h1.add("ratan");
		h1.add("anu");
		h1.add("durga");
		h1.add("shravya");
		
		System.out.println(h1);
		
		HashSet<String> h2 = new HashSet<String>();
		
		System.out.println(h2.add("ratan"));
		System.out.println(h2.add("ratan"));
		System.out.println(h2);
	}
}
