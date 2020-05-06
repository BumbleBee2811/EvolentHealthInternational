package com.ehi.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Contact {
	
	private Integer id;
	@NotNull(message="(*)is required")
	@Size(min=1,message="(*)is required")
	private String firstName;
	
	@NotNull(message="(*)is required")
	@Size(min=1,message="(*)is required")
	private String lastName;
	
	@NotNull(message="(*)is required")
	@Size(min=1,message="(*)is required")
	private String email;
	
	@NotNull(message="(*)is required")
	@Pattern(regexp="[0-9]{10}", message="(*) Invalid entry. Enter a 10 digit phone number")
	private String phoneNumber;
	
	@NotNull(message="(*) select one option")
	private String status;
	
	//Default Constructor
	public Contact()
	{
		
	}

	public Contact(Integer id, String firstName, String lastName, String email, String phoneNumber, String status) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
