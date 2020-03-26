package com.collection;
import java.util.ArrayList;

public class arraylistClone implements Cloneable
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("shubham");
		al.add("sujata");
		al.add("bhanudas");
		
		ArrayList<String> copy = (ArrayList<String>)al.clone();
		
		System.out.println(copy);
	}
}
