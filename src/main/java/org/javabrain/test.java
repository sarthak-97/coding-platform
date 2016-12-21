package org.javabrain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	      SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	      
	      Session session =	sessionFactory.openSession();
	      session.beginTransaction();	     	     
	      session.getTransaction().commit();
	      session.close();
	      
	      
	      	}



}
