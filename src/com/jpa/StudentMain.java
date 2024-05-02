package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class StudentMain {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentBean stu1= new StudentBean();
		stu1.setName("AKN");
		
		StudentBean stu2= new StudentBean();
		stu2.setName("aaa");
		
		em.persist(stu1);
		em.persist(stu2);
		em.getTransaction().commit();
	}
}
