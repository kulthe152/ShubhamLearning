package com.adap;

import com.Akash.PilotPen;

public class penAdapter implements Pen
{
	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) 
	{
		pp.mark(str);
	}
	
}
