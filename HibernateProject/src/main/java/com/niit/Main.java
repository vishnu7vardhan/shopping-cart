package com.niit;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;


public class Main {
 
	public static void main(String[] args)
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p=new Product();
		p.setProductId("10");
		p.setProductName("abc");
		Transaction tx = session.beginTransaction();	
          session.save(p);

		tx.commit();
 
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	