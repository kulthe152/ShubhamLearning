package com.kulthe.hibe_object_state;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class twowheeler 
{
	@Id
	private int bike_id;
	private String bike_name;
	private long price;
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "twowheeler [bike_id=" + bike_id + ", bike_name=" + bike_name + ", price=" + price + "]";
	}
	
	
}
