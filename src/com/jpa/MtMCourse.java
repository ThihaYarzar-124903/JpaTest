package com.jpa;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="mtmcourse")
public class MtMCourse {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int cId;
	private String courseName;
	
	@ManyToMany(mappedBy = "lstCourse")
	private List<MtMStudent> lstStudent;
	
	public List<MtMStudent> getLstStudent() {
		return lstStudent;
	}

	public void setLstStudent(List<MtMStudent> lstStudent) {
		this.lstStudent = lstStudent;
	}

	public MtMCourse() {}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
