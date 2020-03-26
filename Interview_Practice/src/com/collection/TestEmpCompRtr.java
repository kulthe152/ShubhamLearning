package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmpCompRtr {

	public static void main(String[] args) 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		
		al.add(new Emp(111,"ratan"));
		al.add(new Emp(444,"anu"));
		al.add(new Emp(333,"shray"));
		al.add(new Emp(222,"durga"));
		
		Collections.sort(al,new EnameComprtr());
		
		for(Emp e : al)
		{
			System.out.println(e.eid+" "+e.ename);
		}
	}
}
