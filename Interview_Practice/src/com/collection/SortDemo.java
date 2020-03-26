package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		al.add("shraya");
		System.out.println("before sorting"+al);
		Collections.sort(al);
		System.out.println("after sorting"+al);
	}

}
