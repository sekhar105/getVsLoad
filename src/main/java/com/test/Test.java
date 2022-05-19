package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Customer;
import com.helper.SessionFactoryRegister;

public class Test {

	
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session =null;
		
		try {
		sessionFactory=SessionFactoryRegister.getinstance();
		session=sessionFactory.openSession();
		Customer customer = session.load(Customer.class, 10);
		System.out.println(customer.getCustomerNo());
//		System.out.println(customer.getCustomerName());
//		System.out.println(customer);
			
		} 
		finally {
			SessionFactoryRegister.closesessionfactory();
		}
	}
}
