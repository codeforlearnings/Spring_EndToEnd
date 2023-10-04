package com.DTO;

public class PersonDTO {
	private String firstName;
	private Integer age;
	public PersonDTO(String firstName, Integer age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public Integer getAge() {
		return age;
	}
}
