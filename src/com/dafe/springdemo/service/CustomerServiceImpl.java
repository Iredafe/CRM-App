package com.dafe.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dafe.springdemo.dao.CustomerDao;
import com.dafe.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	
	//inject customer dao
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
	return customerDao.getCustomers();	
		
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);
	}

}
