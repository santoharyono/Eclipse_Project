/**
 * 
 */
package com.mitraiscdc.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * @author Santo_HW432
 * 
 * Entity using component
 */

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Embedded
	private Address address;
	
//	Mapping collections value types
	@ElementCollection
	@CollectionTable(name = "person_nickname", joinColumns = @JoinColumn(name = "person_id"))
	@Column(name = "nickname")
	private Collection<String> nicknames = new ArrayList<String>();
	
	public Collection<String> getNicknames() {
		return nicknames;
	}

	public void setNicknames(Collection<String> nicknames) {
		this.nicknames = nicknames;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
