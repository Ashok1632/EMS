package com.yash.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "dob")
	private String dob;
	
	@Column(name = "joining_date")
    private String joining_date;
	
 @Column(name = "project") 
 private String project;
 
 @Column(name="business_unit")
  private String business_unit;
 

 
 public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}
@Column(name="designation")
 private String designation;
 
	public String getDob() {
	return dob;
}


public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	

	public String getBusiness_unit() {
		return business_unit;
	}


	public void setBusiness_unit(String business_unit) {
		this.business_unit = business_unit;
	}


public void setDob(String dob) {
	this.dob = dob;
}


public String getJoining_date() {
	return joining_date;
}


public void setJoining_date(String joining_date) {
	this.joining_date = joining_date;
}



	public Employee() {
		
	}
	
	
	public Employee(long id, String firstName, String lastName, String emailIdS) {
		super();
		this.id = id;
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
}
