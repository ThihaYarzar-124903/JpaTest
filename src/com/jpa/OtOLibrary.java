package com.jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="otolibrary")
public class OtOLibrary {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private OtOStudent student;
	
	
	public OtOStudent getStudent() {
		return student;
	}

	public void setStudent(OtOStudent student) {
		this.student = student;
	}

	public OtOLibrary() {}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
