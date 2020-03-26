package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist_DataReading 
{
	public static void main(String args[])
	{
		LinkedList<book> lib = new LinkedList<book>();
		
		lib.add(new book(11,"java","ratan"));
		lib.add(new book(22,"C","durga"));
		lib.add(new book(33,"python","anu"));
		lib.add(new book(44,"aspnet","shravya"));
		
		ListIterator<book> itr = lib.listIterator();
		
		while(itr.hasNext())
		{
			book b = itr.next();
			if(b.bnnm.equals("C"))
				itr.remove();	
		}
		
		for(book b : lib)
		{
			System.out.println(b.bid+" "+b.bnnm+" "+b.bauth);
		}
	}
}
