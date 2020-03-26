package com.collection;

public class cloneDemo implements Cloneable
{
	int a=10;
	int b=20;
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		cloneDemo c1 = new cloneDemo();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		cloneDemo c2 = (cloneDemo)c1.clone();
		System.out.println(c2.a);
		System.out.println(c2.b);
	}

}
