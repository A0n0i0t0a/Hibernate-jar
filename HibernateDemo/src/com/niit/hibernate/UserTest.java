package com.niit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UserTest {
	public static void main(String[] args) 
	{
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	User u1=new User();
	//u1.setId(101);
	u1.setName("Anita");
	u1.setPassword("Kri");
	u1.setEmail("abc@gmail.com");
	
	session.save(u1);
	t.commit();
	System.out.println("Succesfully Saved");
	session.close();
	
	

	}

}
