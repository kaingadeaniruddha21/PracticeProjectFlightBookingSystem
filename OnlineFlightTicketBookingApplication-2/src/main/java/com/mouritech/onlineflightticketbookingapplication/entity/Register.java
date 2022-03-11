package com.mouritech.onlineflightticketbookingapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="register")
public class Register {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "register_id")
    private Long registerId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "phone_no")
	private long phoneNo;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "email_id")
	@Email(message = "Not a valid email")
	private String emailId;
	
	
	public Register(Long registerId, String firstName, String lastName, String middleName, long phoneNo, String gender,
			String emailId) {
		super();
		this.registerId = registerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.emailId = emailId;
	}
	
	public Register(String firstName, String lastName, String middleName, long phoneNo, String gender, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.emailId = emailId;
	}

	public Long getRegisterId() {
		return registerId;
	}
	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Register [registerId=" + registerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", phoneNo=" + phoneNo + ", gender=" + gender + ", emailId=" + emailId
				+ "]";
	}
	
	
}
