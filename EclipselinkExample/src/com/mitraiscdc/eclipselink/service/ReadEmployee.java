package com.mitraiscdc.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitraiscdc.eclipselink.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EclipselinkExample");
		EntityManager manager = factory.createEntityManager();
		
		Employee selectedEmployee = manager.find(Employee.class, 1);
		
		System.out.println("Selected Employee");
		System.out.println(selectedEmployee.getId());
		System.out.println(selectedEmployee.getName());
		System.out.println(selectedEmployee.getSalary());
		System.out.println(selectedEmployee.getDeg());

	}

}
