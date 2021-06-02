package com.example.registrationservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Registration {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min=1,max=25)
	@Pattern(regexp="[A-Za-z]*",message="must contain only letters")
	private String name;
	
	
	@NotNull
	@Email
	@NotEmpty
	private String emailId;
	
	@NotNull
	private String password;
	
	@NotNull
	private String address;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private int zipCode;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int id,String name, String emailId, String password, String address, String city, String state,
			int zipCode) {
		super();
		this.id = id;
		this.name=name;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
		

}
