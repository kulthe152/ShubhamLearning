package com.kulthe.proto;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
	private String Shopname;
	List<Book> bok = new ArrayList<>();
	
	public String getShopname() {
		return Shopname;
	}
	public void setShopname(String shopname) {
		Shopname = shopname;
	}
	public List<Book> getBok() {
		return bok;
	}
	public void setBok(List<Book> bok) {
		this.bok = bok;
	}
	
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			getBok().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [Shopname=" + Shopname + ", bok=" + bok + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop bsp = new BookShop();
		for(Book b : this.getBok())
		{
			bsp.getBok().add(b);
		}
		return bsp;
	}
	 
	
	
	
}
