package com.collection;

import java.util.ArrayList;

public class add_1CollnInto_another {

	public static void main(String[] args) 
	{
			// 2. Add one collection into another collection
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(11);
		a1.add(12);
		a1.add(13);
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(100);
		a2.add(101);
		a2.add(102);
		a2.add(103);
		a2.retainAll(a1);
		System.out.println(a2);		//approach 1
		
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(201);
		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(202);
		ArrayList<Integer> b3 = new ArrayList<Integer>();
		b3.add(300);
		b3.addAll(b1);
		b3.addAll(b2);
		System.out.println(b3);		//approach 2
	}
}
