package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		StudentBean bean = em.find(StudentBean.class, 1);
		bean.setName("Mg Mg");
		em.merge(bean);
		em.getTransaction().commit();

	}

}
