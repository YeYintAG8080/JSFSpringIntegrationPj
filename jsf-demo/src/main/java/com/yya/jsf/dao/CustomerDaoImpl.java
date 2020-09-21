package com.yya.jsf.dao;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.yya.jsf.model.Customer;

@Repository
public class CustomerDaoImpl  implements CustomerDao  {	
	
 	@Autowired
	SessionFactory sessionFactory;
 	
	@Override
	public List<Customer> listCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
		List<Customer> cusList = session.createQuery("from Customer").list();
        for(Customer c : cusList){
           System.out.println(c.getEmail());
        }
        return cusList;
    }
 	
	
}
