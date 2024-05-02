package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OtOMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		OtOStudent s1 = new OtOStudent();
		s1.setName("Mg Mg");
		
		OtOStudent s2 = new OtOStudent();
		s2.setName("Ko Ko");
		
		OtOLibrary lb1 = new OtOLibrary();
		lb1.setBookName("Java");
		lb1.setStudent(s1);
		
		OtOLibrary lb2 = new OtOLibrary();
		lb2.setBookName("Colbol");
		lb2.setStudent(s2);
		
		em.persist(lb1);
		em.persist(lb2);
		em.getTransaction().commit();

	}

}
