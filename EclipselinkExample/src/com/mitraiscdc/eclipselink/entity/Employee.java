/**
 * 
 */
package com.mitraiscdc.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Santo_HW432
 *
 */

@Entity
@Table
@NamedQuery(query = "select e from Employee e where e.id = :id", name = "find employee by ID")
public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	private String deg;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, String deg) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deg = deg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	
}
