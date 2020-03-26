package com.collection;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class linkedlist_instanceOf {

	public static void main(String[] args) 
	{
		LinkedList<String> li = new LinkedList<String>();
		
		System.out.println(li instanceof Cloneable);
		System.out.println(li instanceof Serializable);
		System.out.println(li instanceof RandomAccess);
	}
}
