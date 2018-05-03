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
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String teacherName;
	private String subject;

	@ManyToMany(targetEntity = Class.class)
	private Set classSet;

	public Teacher() {
		super();
	}

	public Teacher(int id, String teacherName, String subject, Set classSet) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.subject = subject;
		this.classSet = classSet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set getClassSet() {
		return classSet;
	}

	public void setClassSet(Set classSet) {
		this.classSet = classSet;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", subject=" + subject + "]";
	}

}
