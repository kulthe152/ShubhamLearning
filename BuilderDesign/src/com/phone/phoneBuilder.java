package com.phone;

public class phoneBuilder
{
	private String os;
	private int ram;
	private String proc;
	private double screensize;
	private int battery;
	
	public phoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public phoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phoneBuilder setProc(String proc) {
		this.proc = proc;
		return this;
	}
	public phoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public phoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;  
	}
	
	public phone getphone()
	{
		 return new phone(os, ram, proc, screensize, battery);

	}
}
