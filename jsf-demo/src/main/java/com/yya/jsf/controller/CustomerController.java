package com.yya.jsf.controller;

 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yya.jsf.model.Customer;
import com.yya.jsf.service.CustomerService;


@ManagedBean(name="customerController")
@Controller
@ViewScoped
public class CustomerController {

 	@Autowired
	CustomerService customerService;
	
	@PostConstruct
	public void load() {
		if(this.customerService.listCustomers().get(0)!=null) {
		Customer c=this.customerService.listCustomers().get(0);
		this.setFirstName(c.getFname());
		this.setLastName(c.getLname());
		return; 
		}else {
			return;
		}
	}
	
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
}
