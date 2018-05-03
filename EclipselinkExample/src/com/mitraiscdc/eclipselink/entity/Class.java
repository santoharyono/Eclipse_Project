/**
 * 
 */
package com.mitraiscdc.eclipselink.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Santo_HW432
 *
 */

@Entity
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String className;

	@ManyToMany(targetEntity = Teacher.class)
	private Set teacherSet;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(int id, String className, Set teacherSet) {
		super();
		this.id = id;
		this.className = className;
		this.teacherSet = teacherSet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Set getTeacherSet() {
		return teacherSet;
	}

	public void setTeacherSet(Set teacherSet) {
		this.teacherSet = teacherSet;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", className=" + className + "]";
	}

}
