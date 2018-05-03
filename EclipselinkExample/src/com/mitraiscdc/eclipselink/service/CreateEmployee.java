/**
 * 
 */
package com.mitraiscdc.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitraiscdc.eclipselink.entity.Employee;

/**
 * @author Santo_HW432
 * Insert new Record to database (mysql)
 *
 */
public class CreateEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Employee newEmployee = new Employee(1, "Tiara Casey", 10000D, "Technical Advisor");
		
		manager.persist(newEmployee);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
