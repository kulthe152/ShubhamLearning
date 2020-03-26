package com.kulthe.compo;

public class compositeTest 
{
	public static void main(String args[])
	{
		Component hd = new leaf(4000,"HDD");
		Component mouse = new leaf(500,"mouse");
		Component monitor = new leaf(8000,"monitor");
		Component ram = new leaf(3500,"ram");
		Component cpu = new leaf(15000,"cpu");
		
		composite ph = new composite("ph");
		composite cabinet = new composite("cabinet");
		composite mb = new composite("mb");
		composite computer = new composite("computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}
}
