package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
	public static void main(String args[])
	{
		LinkedHashSet<Emp> lh = new LinkedHashSet<Emp>();
		
		lh.add(new Emp(111,"ratan"));
		lh.add(new Emp(444,"anu"));
		lh.add(new Emp(333,"shray"));
		lh.add(new Emp(222,"durga"));
		
		Iterator<Emp> eitr = lh.iterator();	
		
		while(eitr.hasNext())
		{
			Emp e1 = eitr.next();
			if(e1.ename.equals("anu"))
				eitr.remove();
		}
		for(Emp e : lh)
		{
			System.out.println(e.eid+" "+e.ename);
		}
	}
}
