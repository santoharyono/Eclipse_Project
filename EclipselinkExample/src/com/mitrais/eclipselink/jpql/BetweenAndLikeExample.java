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
public class BetweenAndLikeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
//		Between
		String sql = "select e from Employee e where e.salary Between 30000 and 40000";
		Query query = manager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
		List<Employee> employeeSalaries = query.getResultList();
		
		employeeSalaries.forEach(employee -> System.out.printf("Employee Name : %s salary: %s%n", employee.getName(), employee.getSalary()));
	}

}
