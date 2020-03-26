package com.phone;

public class shop 
{
	public static void main(String args[])
	{
		phone p = new phoneBuilder().setOs("android").setRam(2).getphone();
		System.out.println(p);
	}
}
