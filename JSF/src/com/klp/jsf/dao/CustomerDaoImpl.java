package com.klp.jsf.dao;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.klp.jsf.entity.Customer;

@Repository 
public class CustomerDaoImpl implements CustomerDao{
	//need to inject SessionFactory
	@Autowired
	private SessionFactory sessionFactory;
  


	@Override
	public Customer getCustomers(String firstName) {
		//get the hibernate session
				Session session=sessionFactory.getCurrentSession();
				
				//get the customer by id
				Customer customer = (Customer) session.createQuery("from Customer c where c.firstName LIKE 'firstName%'").list().get(0);
				return customer;
	}
 

}
