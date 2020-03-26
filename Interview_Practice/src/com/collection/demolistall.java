package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class demolistall 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		al.add("sravya");
		
		ListIterator<String> li = al.listIterator();
		
		
		while(li.hasNext())
		{
			String s3 = li.next();
			if(s3.equals("durga"))
			{
				li.remove();
			}
		}
		while(li.hasNext())
		{
			String s4 = li.next();
			if(s4.equals("anu"))
			{
				li.set("Anushka");
			}
		}
		
		System.out.println(al);
	}
}
