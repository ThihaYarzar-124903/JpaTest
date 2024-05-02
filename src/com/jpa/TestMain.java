package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class TestMain {

    public static void main(String[] args) {
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("JPATest");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        OtMStudent1 s1 = new OtMStudent1();
        s1.setName("Mg Mg");

        OtMStudent1 s2 = new OtMStudent1();
        s2.setName("Ag Ag");

        OtMCourse1 c1 = new OtMCourse1();
        c1.setCourseName("PFC");

        OtMCourse1 c2 = new OtMCourse1();
        c2.setCourseName("JWD");

        Tables otMTables1 = new Tables();
        Tables otMTables2 = new Tables();

        otMTables1.setLstCourse(c1);
        otMTables2.setLstCourse(c2);

        otMTables1.setLstStudent(s1);
        otMTables2.setLstStudent(s2);

        em.persist(otMTables1);
        em.persist(otMTables2);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}