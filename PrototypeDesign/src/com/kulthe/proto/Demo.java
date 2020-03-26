package com.kulthe.proto;

public class Demo 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		BookShop bs =new BookShop();
		bs.setShopname("British Library");
		bs.loadData();
		
		
		BookShop b2 = bs.clone();
		bs.getBok().remove(2);
		b2.setShopname("Novality");
		
		
		
		
		
		System.out.println(bs);
		System.out.println(b2);
	}
} 
