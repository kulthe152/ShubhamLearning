package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("sk");
		al.add("pj");
		al.add("sm");
		al.add("dp");
		al.add("rohini");
		al.add("sg");
		al.add("shad");
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			String s1 = li.next();
			System.out.println(s1);
		}
		
		System.out.println("\n");
		
		while(li.hasPrevious())
		{
			String s2 = li.previous();
			System.out.println(s2);
		}
	}
}
