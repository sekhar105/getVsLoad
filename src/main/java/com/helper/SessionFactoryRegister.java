package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegister {

	private static SessionFactory sessionFactory;
	
	
	static {
		try {
			Configuration configuration =new Configuration().configure();
			sessionFactory=configuration.buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		} 
		}
	
	public static SessionFactory getinstance() {
		return sessionFactory;
	}
	public static void closesessionfactory() {
		
		if(sessionFactory!=null) {
			sessionFactory.close();
			sessionFactory=null;
	}
}
}
	
	

