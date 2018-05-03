/**
 * 
 */
package com.mitraiscdc.eclipselink.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitraiscdc.eclipselink.entity.Class;
import com.mitraiscdc.eclipselink.entity.Teacher;

/**
 * @author Santo_HW432
 *
 */
public class ManyToManyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		// Create class Entity
		Class class1 = new Class(0, "1st", null);
		Class class2 = new Class(0, "2nd", null);
		Class class3 = new Class(0, "3rd", null);

		// Store class
		manager.persist(class1);
		manager.persist(class2);
		manager.persist(class3);

		Set<Class> classSet1 = new HashSet<>();
		classSet1.add(class1);
		classSet1.add(class2);
		classSet1.add(class3);

		Set<Class> classSet2 = new HashSet<>();
		classSet1.add(class1);
		classSet1.add(class2);
		classSet1.add(class3);

		// Create Teacher Entity
		Teacher teacher1 = new Teacher(0, "Satish", "Java", classSet1);
		Teacher teacher2 = new Teacher(0, "Krishna", "Adv Java", classSet2);
		Teacher teacher3 = new Teacher(0, "Masthanvali", "DB2", classSet2);
		
//		Store teacher
		manager.persist(teacher1);
		manager.persist(teacher2);
		manager.persist(teacher3);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
