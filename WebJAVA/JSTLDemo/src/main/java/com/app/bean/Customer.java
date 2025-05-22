package com.app.bean;

import java.io.Serializable;

public class Customer implements Serializable{

	private String firstname;
	private String lastname;
	private String email;
	private boolean status;
	
	public Customer() {}

	public Customer(String firstname, String lastname, String email, boolean status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.status = status;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
