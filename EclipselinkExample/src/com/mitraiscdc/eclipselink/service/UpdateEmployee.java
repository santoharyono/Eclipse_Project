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
 *
 * Update record to database (mysql)
 */
public class UpdateEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
		Employee employee = manager.find(Employee.class, 1);
		manager.getTransaction().begin();
		
//		before update
		System.out.println(employee);
		
//		begin update
		employee.setName("Grant Walton");
		employee.setSalary(150000D);
		
		manager.getTransaction().commit();
		
//		clean up
		manager.close();
		factory.close();
		
	}

}
