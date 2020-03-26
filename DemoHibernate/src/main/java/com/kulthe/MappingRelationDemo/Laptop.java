package com.kulthe.MappingRelationDemo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lnm;
	@ManyToMany
	private List<Student> studdt = new ArrayList<Student>();
	
	
	public int getLid() {
		return lid;
	} 
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLnm() {
		return lnm;
	}
	public void setLnm(String lnm) {
		this.lnm = lnm;
	}
	public List<Student> getStuddt() {
		return studdt;
	}
	public void setStuddt(List<Student> studdt) {
		this.studdt = studdt;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lnm=" + lnm + "]";
	}
		
}
