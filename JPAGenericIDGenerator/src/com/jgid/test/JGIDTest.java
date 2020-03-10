package com.jgid.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jgid.entities.PersonalDetails;
import com.jgid.helper.EntityManagerRegistry;

public class JGIDTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		PersonalDetails details = null;
		boolean flag = false;

		try {
			entityManagerFactory = EntityManagerRegistry.getOracleFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			details = new PersonalDetails();
			details.setAge(21);
			details.setBloodGroup("A+");
			details.setEmailId("talek@amazon.com");
			details.setName("Abhik");
			entityManager.persist(details);
			System.out.println(details.getAadharNo());

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			EntityManagerRegistry.close();
		}

	}
}
