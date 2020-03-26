package com.adap;

import com.Akash.PilotPen;

public class School 
{
	public static void main(String[] args)throws ClassCastException
	{
		Pen p = new penAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("i am tired to wrte assignment");
	}
}
