package com.collection;

import java.util.Comparator;

public class EnameComprtr implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1, Emp e2)
	{
		return e1.ename.compareTo(e2.ename);
	}
}
