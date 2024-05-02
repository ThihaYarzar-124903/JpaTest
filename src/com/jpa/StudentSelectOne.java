package com.jpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentSelectOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		StudentBean st = em.find(StudentBean.class, 1);
		
		//System.out.println(st);
		
		List<StudentBean> studList =em.createQuery("select sb from StudentBean sb").getResultList();
		
		for(StudentBean studentBean : studList) {
			System.out.println(studentBean);
		}
	}

}
