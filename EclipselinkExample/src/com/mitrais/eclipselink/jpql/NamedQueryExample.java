/**
 * 
 */
package com.mitrais.eclipselink.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mitraiscdc.eclipselink.entity.Employee;

/**
 * @author Santo_HW432
 *
 */
public class NamedQueryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
		String namedQuery = "find employee by ID";
		Query query = manager.createNamedQuery(namedQuery);
		query.setParameter("id", 1);
		
		@SuppressWarnings("unchecked")
		List<Employee> selectedEmployee = query.getResultList();
		
		selectedEmployee.forEach(employee -> System.out.println(employee.getName()));
	}

}
