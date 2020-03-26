package com.collection;

public class Emp2 implements Comparable<Emp2>
{
	int eid;
	String ename;
	
	public Emp2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int compareTo(Emp2 e2) 
	{
		return ename.compareTo(e2.ename);
	}

//	@Override
//	public int compareTo(Emp2 e) {
//		if(eid==e.eid)
//			return 0;
//		else if(eid>e.eid)
//			return 1;
//		else
//			return -1;
//	}					/// using generic version
	
	

//	@Override
//	public int compareTo(Object o) {
//		
//		Emp2 e1 =(Emp2) o;
//		if(eid==e1.eid)
//			return 0;
//		else if(eid>e1.eid)
//			return 1;
//		else
//			return -1;
//	} 					///	using normal version
	
}
