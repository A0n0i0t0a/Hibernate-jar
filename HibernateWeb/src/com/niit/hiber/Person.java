package com.niit.hiber;

public class Person {
	private int id;
	private String name;
	private Job job;
	private String emailAddress;
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param job
	 * @param emailAddress
	 */
	public Person(int id, String name, Job job, String emailAddress) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.emailAddress = emailAddress;
	}
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
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", job=" + job + ", emailAddress=" + emailAddress + "]";
	}
	

}
