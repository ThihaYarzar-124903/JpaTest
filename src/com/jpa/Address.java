package com.jpa;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String tsp;
	private String city;
	
	public String getTsp() {
		return tsp;
	}
	public void setTsp(String tsp) {
		this.tsp = tsp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
