package com.niit.hiber;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;



public class UserDao
{
	public static int register(User u)
	{
		int cnt=0;
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		t.begin();
		cnt=(Integer)session.save(u);
		t.commit();
		session.close();
		return cnt;
	}

}
