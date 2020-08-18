package com.klp.jsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.klp.jsf.entity.Customer;
import com.klp.jsf.service.CustomerService;

@ManagedBean(name="indexController")
@RequestScoped
public class IndexController {
	
	//form props
	private String fname;
	private String fullName;
	
	//Service Injection
//	@Autowired
//	private CustomerService customerService;
	
	//form actions related to index.xhtml
	public void getCustomerNameByFirstName() {
		System.out.println(this.fname);
//		Customer customer=this.customerService.getCustomer("Ye Yint");
		
		this.setFullName(this.fname);
		
		return;
	}

	
	//getters & setters
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	
	
	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

 
	
	
	 
	
	
}
