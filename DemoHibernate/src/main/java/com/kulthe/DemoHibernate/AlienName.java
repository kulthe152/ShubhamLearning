package com.kulthe.DemoHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName 
{
	private String fnm;
	private String mnm;
	private String lnm;
	
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public String getMnm() {
		return mnm;
	}
	public void setMnm(String mnm) {
		this.mnm = mnm;
	}
	public String getLnm() {
		return lnm;
	}
	public void setLnm(String lnm) {
		this.lnm = lnm;
	}
	
	
	@Override
	public String toString() {
		return "AlienName [fnm=" + fnm + ", mnm=" + mnm + ", lnm=" + lnm + "]";
	}
	
	
}
