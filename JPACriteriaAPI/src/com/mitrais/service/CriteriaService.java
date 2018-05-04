/**
 * 
 */
package com.mitrais.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.mitrais.entity.Employee;

/**
 * @author Santo_HW432
 *
 */
public class CriteriaService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACriteriaAPI");
		EntityManager manager = factory.createEntityManager();
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = builder.createQuery();
		
		Root<Employee> from = criteriaQuery.from(Employee.class);
		
//		select all records and ordering by salary ascending
		System.out.println("select all records");
		CriteriaQuery<Object> select = criteriaQuery.select(from).orderBy(builder.asc(from.get("salary")));
		TypedQuery<Object> typedQuery = manager.createQuery(select);
		
		List<Object> resultList = typedQuery.getResultList();
		
		resultList.forEach(o -> {
			Employee e = (Employee) o;
			System.out.printf("ID : %s, Name : %s, Salary : %s, Degree : %s%n", e.getId(), e.getName(), e.getSalary(), e.getDeg());
		});
		
	}

}
