package com.jpa;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeBean implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int emId;
	private String name;
	
	@CollectionTable(name = "emp_add")
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Address> lstAddress;
	
	public List<Address> getLstAddress() {
		return lstAddress;
	}

	public void setLstAddress(List<Address> lstAddress) {
		this.lstAddress = lstAddress;
	}

	public EmployeeBean() {}

	public int getEmId() {
		return emId;
	}

	public void setEmId(int emId) {
		this.emId = emId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
