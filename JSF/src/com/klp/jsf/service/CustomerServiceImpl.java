package com.klp.jsf.service;

 

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.klp.jsf.dao.CustomerDao;
import com.klp.jsf.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@PostConstruct
	public void postconstructService() {
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------");
	}
	
	//inject CustomerDao
	@Autowired
	private CustomerDao customerDAO;
 
	@Override
	@Transactional(readOnly=true)
	public Customer getCustomer(String firstName) {
		Customer cus=new Customer();
		cus.setFirstName("fn");
		cus.setLastName("ln");
		cus.setEmail("em");
		cus.setId(2);
		return cus;
		
		 //return customerDAO.getCustomers(firstName);
	}


}
