package com.jpa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MtMMain {

	public static void main(String []args) {
		EntityManagerFactory emf =
		Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		MtMStudent s1 =new MtMStudent();
		s1.setName("Mg Mg");
		
		MtMStudent s2 =new MtMStudent();
		s2.setName("Ag Ag");
		
		MtMCourse c1 =new MtMCourse();
		c1.setCourseName("PFC");
		
		MtMCourse c2 =new MtMCourse();
		c2.setCourseName("JWD");
		
		List<MtMCourse> list1=new ArrayList<MtMCourse>();
		list1.add(c1);
		list1.add(c2);
		
		List<MtMCourse> list2=new ArrayList<MtMCourse>();
		list2.add(c2);
		
		s1.setLstCourse(list1);
		s2.setLstCourse(list2);
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();
		
	}
}
