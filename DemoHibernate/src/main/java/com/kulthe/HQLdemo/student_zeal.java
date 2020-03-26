package com.kulthe.HQLdemo;

import javax.persistence.*;

@Entity

public class student_zeal
{
	@Id
	private int rollno;
	private String snm;
	private int marks;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "student_zeal [rollno=" + rollno + ", snm=" + snm + ", marks=" + marks + "]";
	}
	
	
	
	
}
