/**
 * 
 */
package com.mitraiscdc.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

/**
 * @author Santo_HW432
 *
 */
@Entity
@Table(name = "guide")
@BatchSize(size = 5)
public class Guide {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "salary")
	private float salary;
	
	@Column(name = "staff_id")
	private String staffId;
	
	@OneToMany(mappedBy = "guide", cascade = {CascadeType.PERSIST})
	private Set<Student> students = new HashSet<Student>();

	public Guide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guide(String name, float salary, String staffId, Set<Student> students) {
		super();
		this.name = name;
		this.salary = salary;
		this.staffId = staffId;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
