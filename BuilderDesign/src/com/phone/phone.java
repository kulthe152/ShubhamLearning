package com.phone;

public class phone 
{
	private String os;
	private int ram;
	private String proc;
	private double screensize;
	private int battery;
	
	public phone(String os, int ram, String proc, double screensize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.proc = proc;
		this.screensize = screensize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "phone [os=" + os + ", ram=" + ram + ", proc=" + proc + ", screensize=" + screensize + ", battery="
				+ battery + "]";
	}
	
	
}
