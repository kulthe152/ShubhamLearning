package com.kulthe;

public class student 
{
	int rno;
	String nm;
	
	
	
	public int getRno() {
		return rno;
	}



	public void setRno(int rno) {
		this.rno = rno;
	}



	public String getNm() {
		return nm;
	}



	public void setNm(String nm) {
		this.nm = nm;
	}



	public student(int rno, String nm) {
		super();
		this.rno = rno;
		this.nm = nm;
	}



	@Override
	public String toString() {
		return "student [rno=" + rno + ", nm=" + nm + "]";
	}
	
	
	 
}
