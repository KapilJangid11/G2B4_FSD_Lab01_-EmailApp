package com.greatlearning.emailapp;

public class Employee {
	private String firstName;
	private String lastName;
	private String departmant;
	
	private String email;
	private String password;
	
	public Employee(String firstName, String lastName, String departmant) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmant = departmant;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartmant() {
		return departmant;
	}
	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}


