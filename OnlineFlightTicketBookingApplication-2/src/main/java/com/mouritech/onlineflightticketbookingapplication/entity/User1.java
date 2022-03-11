//package com.mouritech.onlineflightticketbookingapplication.entity;
//
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.Email;
//
//@Entity
//@Table(name="users1")
//public class User1 {
//	
//	@Column(name = "user_name")
//	private String userName;
//	
//	@Column(name = "email")
//	@Email(message = "Not a valid email")
//    private String email;
//	
//	@Column(name = "password")
//    private String password;
//	
//	public User() {
//		
//	}
//	
//   public User(String userName, @Email(message = "Not a valid email") String email) {
//		super();
//		this.userName = userName;
//		this.email = email;
//	}
//
//public Long getUserId() {
//	return userId;
//}
//
//public void setUserId(Long userId) {
//	this.userId = userId;
//}
//
//public String getUserName() {
//	return userName;
//}
//
//public void setUserName(String userName) {
//	this.userName = userName;
//}
//
//public String getPassword() {
//	return password;
//}
//
//public void setPassword(String password) {
//	this.password = password;
//}
//
//
//public String getEmail() {
//	return email;
//}
//
//public void setEmail(String email) {
//	this.email = email;
//}
//
//@Override
//public String toString() {
//	return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
//}
//
//
//
//
//
//
//
//	
//
//	
//
//}
