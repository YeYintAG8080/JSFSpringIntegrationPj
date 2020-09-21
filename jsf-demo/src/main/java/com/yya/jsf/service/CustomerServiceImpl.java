package com.yya.jsf.service;
 
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import com.yya.jsf.dao.CustomerDao;
import com.yya.jsf.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@PostConstruct
	public void load() {
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
	}

 	@Autowired
	CustomerDao customerDao; 
	
	@Override
	@Transactional
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return customerDao.listCustomers();
	}


}
