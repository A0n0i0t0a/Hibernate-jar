package com.niit.hiber;

public class StudentClass {
	private String classId;
	private String className;
	
	
	/**
	 * @param classId
	 * @param className
	 */
	public StudentClass(String classId, String className) {
		//super();
		this.classId = classId;
		this.className = className;
	}
	
	/**
	 * 
	 */
	public StudentClass() {
		//super();
	}

	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	


}
