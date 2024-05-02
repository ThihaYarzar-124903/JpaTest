package com.jpa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeMain {
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address add1 = new Address();
		add1.setTsp("Hlaing");
		add1.setCity("ygn");
		
		Address add2 = new Address();
		add2.setTsp("Shwe");
		add2.setCity("ygn");
		
		List<Address> addList = new ArrayList<Address>();
		addList.add(add1);
		addList.add(add2);
		
		EmployeeBean emp1 = new EmployeeBean();
		emp1.setName("Mg Mg");
		emp1.setLstAddress(addList);
		
		em.persist(emp1);
		em.getTransaction().commit();
		
		
		
	}
}
