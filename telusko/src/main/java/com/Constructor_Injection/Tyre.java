package com.Constructor_Injection;

public class Tyre 
{
	private String brand;

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
