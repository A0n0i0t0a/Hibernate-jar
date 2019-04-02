package com.niit.hibernate;
//import javax.security.auth.login.Configuration;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeTest
{
	public static void main(String[] args) 
	{
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setId(101);
	e1.setFirstName("Anita");
	e1.setLastName("Kri");
	e1.setSalary(1000);
	
	session.save(e1);
	t.commit();
	System.out.println("Succesfully Saved");
	session.close();
	
	

	}
}
