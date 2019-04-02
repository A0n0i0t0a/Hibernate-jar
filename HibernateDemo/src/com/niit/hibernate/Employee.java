package com.niit.hibernate;


public class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	/*public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}*/
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	

}
