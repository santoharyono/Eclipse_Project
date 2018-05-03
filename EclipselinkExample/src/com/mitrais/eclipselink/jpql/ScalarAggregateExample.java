/**
 * 
 */
package com.mitrais.eclipselink.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Santo_HW432
 *
 */
public class ScalarAggregateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();

		// scalar function
		Query query = manager.createQuery("select UPPER(e.name) from Employee e", String.class);

		@SuppressWarnings("unchecked")
		List<String> resultList = query.getResultList();

		resultList.forEach(upperName -> System.out.println(upperName));

	}

}
