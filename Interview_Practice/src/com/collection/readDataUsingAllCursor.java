package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class readDataUsingAllCursor 
{
	public static void main(String[] args) 
	{
		Vector<Product> prod = new Vector<Product>();
		prod.add(new Product(111,"pen",10.5));
		prod.add(new Product(222,"fan",610.5));
		prod.add(new Product(333,"chair",310.5));
		prod.add(new Product(444,"light",142.5));
		
		Enumeration<Product> ep = prod.elements();
		while(ep.hasMoreElements())
		{
			Product p = ep.nextElement();
			System.out.println(p.pid+" "+ p.pnm + " "+ p.pcost);
		}
		System.out.println("\n");
		
		Iterator<Product> ip = prod.iterator();
		while(ip.hasNext())
		{
			Product p1 = ip.next();
			System.out.println(p1.pid+" "+ p1.pnm +" "+p1.pcost);
		}
		System.out.println("\n");
		
		ListIterator<Product> lip = prod.listIterator();
		while(lip.hasNext())
		{
			Product p3 = lip.next();
			System.out.println(p3.pid+" "+p3.pnm+" "+p3.pcost);
		}
	}
}

