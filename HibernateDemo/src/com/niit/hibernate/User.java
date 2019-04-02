package com.niit.hibernate;

public class User
{
	private int id;
	private String name,password,email;
	final int getId() {
		return id;
	}
	final void setId(int id) {
		this.id = id;
	}
	final String getName() {
		return name;
	}
	final void setName(String name) {
		this.name = name;
	}
	final String getPassword() {
		return password;
	}
	final void setPassword(String password) {
		this.password = password;
	}
	final String getEmail() {
		return email;
	}
	final void setEmail(String email) {
		this.email = email;
	}
	
}
