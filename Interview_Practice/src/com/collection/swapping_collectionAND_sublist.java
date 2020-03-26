package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class swapping_collectionAND_sublist {

	public static void main(String[] args) 
	{
		// 4. SWAPPING THE DATA : swap()/sublist()
		
				ArrayList<String> al4 = new ArrayList<String>();
				al4.add("anu");
				al4.add("manoj");
				al4.add("vaibhavi");
				al4.add("gunjan");
				al4.add("varad");
				al4.add("kaka");
				System.out.println("\n Before swapping "+al4);
				Collections.swap(al4, 3, 1);
				System.out.println("\n after swapping "+al4);
				
				ArrayList<String> al5 = new ArrayList<String>(al4.subList(1, 5));
				al5.add("anjali");
				System.out.println("\n"+al5);
	}
}
