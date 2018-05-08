/**
 * 
 */
package com.mitraiscdc.hibernate.entity;

import javax.persistence.Embeddable;

/**
 * @author Santo_HW432
 *
 * Component sample
 */

@Embeddable
public class Address {
	private String city;
	private String street;
	private String zipcode;
	
	
	public Address() {
		super();
	}

	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
