package net.guides.springboot2.springboot2jpacrudexample.beans;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String role;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}
