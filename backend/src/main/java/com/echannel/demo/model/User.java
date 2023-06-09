package com.echannel.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String passowrd;

	@Column(name = "active")
	private boolean active;

	public User() {

	}

	public User(String userName, String password, boolean active) {
		this.userName = userName;
		this.passowrd = password;
		this.active = active;
	}

	

}
