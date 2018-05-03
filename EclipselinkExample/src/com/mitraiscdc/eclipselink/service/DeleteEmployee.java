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
 * Delete record from database (mysql)
 */
public class DeleteEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Employee deleteEmployee = manager.find(Employee.class, 1);
		manager.remove(deleteEmployee);
		manager.getTransaction().commit();
		
		System.out.println("Delete " + deleteEmployee.getName() + " was successfull");
		manager.close();
		factory.close();
	}

}
