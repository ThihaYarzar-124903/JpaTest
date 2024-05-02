package com.jpa;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="mtmstudent")
public class MtMStudent {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JoinTable(name = "stud_course",joinColumns = @JoinColumn(name="stud_id"),inverseJoinColumns = @JoinColumn(name = "course_id"))
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<MtMCourse> lstCourse;
	
	public MtMStudent() {}

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
	}

	public List<MtMCourse> getLstCourse() {
		return lstCourse;
	}

	public void setLstCourse(List<MtMCourse> lstCourse) {
		this.lstCourse = lstCourse;
	};
	
	
	
	
}
