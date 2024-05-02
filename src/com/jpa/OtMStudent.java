package com.jpa;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="otmstudent")
public class OtMStudent {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JoinColumn(name = "student_id")
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<OtMLibrary> lstLibrary;
	
	public List<OtMLibrary> getLstLibrary() {
		return lstLibrary;
	}

	public void setLstLibrary(List<OtMLibrary> lstLibrary) {
		this.lstLibrary = lstLibrary;
	}

	public OtMStudent() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	
	
	
}
