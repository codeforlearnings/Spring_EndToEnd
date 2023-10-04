package com.DTO;

public class PersonDTO2 {
	private String firstName;
	private String lastName;
	private String email;
	public PersonDTO2(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	
}
