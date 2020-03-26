package com.kulthe.DemoHibernate;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;


@Entity
@Table(name="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Alien 
{
	@Id
	private int aid;
	
	private AlienName aname;
	
	private String acol;
		
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getAcol() {
		return acol;
	}
	public void setAcol(String acol) {
		this.acol = acol;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", acol=" + acol + "]";
	}
	
	
}
