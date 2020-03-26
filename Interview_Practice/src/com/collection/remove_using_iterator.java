package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class remove_using_iterator 
{
	public static void main(String[] args) 
	{
		ArrayList<student> st = new ArrayList<student>();
		st.add(new student(12,"gaurav"));
		st.add(new student(13,"reva"));
		st.add(new student(14,"shubham"));
		st.add(new student(15,"awi"));
		st.add(new student(16,"adi"));
		
		Iterator<student> ist = st.iterator();
		
		while(ist.hasNext())
		{
			student ss = ist.next();
			if(ss.sid==14)
				ist.remove();
			if(ss.sname.equals("awi"))
				ist.remove();
		}
		
		for(student s : st)
		{
			System.out.println(s.sid + " " + s.sname);
		}
	}
}
