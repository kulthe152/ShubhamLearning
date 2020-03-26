package com.kulthe.MappingRelationDemo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Student 
{	
	@Id
	private int rno;
	private String snm;
	private float marks;
	@ManyToMany(mappedBy="studdt")
	private List<Laptop> lapObj = new ArrayList<Laptop>();
	
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public List<Laptop> getLapObj() {
		return lapObj;
	}
	public void setLapObj(List<Laptop> lapObj) {
		this.lapObj = lapObj;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", snm=" + snm + ", marks=" + marks + "]";
	}
	
	
	
}
