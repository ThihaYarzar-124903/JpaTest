package com.jpa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OtMMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		List<OtMLibrary> lstLib = new ArrayList<>();
		
		OtMLibrary lib1 = new OtMLibrary();
		lib1.setBookName("Java");
		
		OtMLibrary lib2 = new OtMLibrary();
		lib2.setBookName("Python");
		
		lstLib.add(lib1);
		lstLib.add(lib2);
		
		OtMStudent stud1 = new OtMStudent();
		stud1.setName("Mg Mg");
		stud1.setLstLibrary(lstLib);
		
		em.persist(stud1);
		em.getTransaction().commit();
	}

}
