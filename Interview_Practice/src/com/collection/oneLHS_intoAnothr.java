package com.collection;

import java.util.LinkedHashSet;

public class oneLHS_intoAnothr {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("ratan");
		h1.add("anu");
		h1.add("durga");
		h1.add("shivani");
		
		LinkedHashSet<String> h2 = new LinkedHashSet<>(h1);
		h2.add("lllll");
		System.out.println(h2);
		
		LinkedHashSet<String> h3 = new LinkedHashSet<>();
		h3.add("beed");
		LinkedHashSet<String> h4 = new LinkedHashSet<>();
		h3.add("Pune");
		
		LinkedHashSet<String> h5 = new LinkedHashSet<>();
		h5.addAll(h3);
		h5.addAll(h4);
		h5.add("aaa");
		System.out.println(h5);
	}
}
