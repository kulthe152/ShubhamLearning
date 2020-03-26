package com.kulthe.compo;
import java.util.*;

interface Component
{
	void showPrice();
}

class leaf implements Component
{
	int pri;
	String nm;
	
	
	public leaf(int pri, String nm) {
		super();
		this.pri = pri;
		this.nm = nm;
	}

	@Override
	public void showPrice() 
	{
		System.out.println(nm + " : " +pri);
	}
}

class composite implements Component
{
	String nm;
	List<Component> components = new ArrayList<>();
	
	public composite(String nm) {
		super();
		this.nm = nm;
	}

	public void addComponent(Component com)
	{
		components.add(com);
	}
	
	@Override
	public void showPrice() 
	{
		System.out.println(nm);
		for(Component c : components)
		{
			c.showPrice();
		}
	}
	
}