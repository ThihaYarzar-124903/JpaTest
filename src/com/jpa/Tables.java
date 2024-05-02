package com.jpa;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "testtable")
public class Tables {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	

	@ManyToOne(cascade = CascadeType.PERSIST)
	private OtMCourse1 lstCourse;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private OtMStudent1 lstStudent;
	
	public Tables() {}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OtMCourse1 getLstCourse() {
		return lstCourse;
	}

	public void setLstCourse(OtMCourse1 lstCourse) {
		this.lstCourse = lstCourse;
	}

	public OtMStudent1 getLstStudent() {
		return lstStudent;
	}

	public void setLstStudent(OtMStudent1 lstStudent) {
		this.lstStudent = lstStudent;
	}
	
	

	
	
	
}
