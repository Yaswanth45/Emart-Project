package com.cts.bls.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="u_id")
	private int userId;
	@Column(name="uName")
	private String userName;
	@Column(name="pass")
	private String password;
	private String role;
	
	public Registration() {
		
	}
	
	

	public Registration(int userId, String userName, String password, String role) {
		
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
