package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDataSorting {

	public static void main(String[] args) 
	{
		ArrayList<Emp2> al = new ArrayList<Emp2>();
		
		al.add(new Emp2(12,"shubham"));
		al.add(new Emp2(11,"pallavi"));
		al.add(new Emp2(13,"snehal"));
		al.add(new Emp2(14,"darshana"));
		
		Collections.sort(al);
		
		for(Emp2 e : al)
		{
			System.out.println(e.eid+" "+e.ename);
		}
	}
}
