package com.DTO;

public class EmployeeDTO {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String genderName;
	private String educationName;
	public EmployeeDTO(Integer id, String firstName, String lastName, Integer age, String genderName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.genderName = genderName;
	}
	public EmployeeDTO(Integer id, String firstName, String lastName, Integer age, String genderName,
			String educationName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.genderName = genderName;
		this.educationName = educationName;
	}
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	public String getGenderName() {
		return genderName;
	}
	public String getEducationName() {
		return educationName;
	}
}
