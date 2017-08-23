package com.rudra.aks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudra.aks.bo.CustomerBO;
import com.rudra.aks.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository<CustomerBO>	cr;
	
	@Override
	public Integer save(CustomerBO customer) {
		return (cr.save(customer).getCustomerid());
	}

}
