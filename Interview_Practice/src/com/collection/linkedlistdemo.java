package com.collection;

import java.util.LinkedList;

public class linkedlistdemo 
{
	public static void main(String args[])
	{
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("ratan");
		li.add("anu");
		li.add("durga");
		li.add("shravya");
		li.add(null);
		
		li.addFirst("aa");
		li.addLast("zz");
		
		System.out.println(li);
		System.out.println(li.size());
		li.add(2,"shubham");
		System.out.println(li);
	}
}
