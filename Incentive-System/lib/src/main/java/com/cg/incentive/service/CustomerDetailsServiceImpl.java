package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.incentive.entities.CustomerDetails;
import com.cg.incentive.exceptions.CustomerAlreadyExistException;
import com.cg.incentive.exceptions.CustomerNotFoundException;
import com.cg.incentive.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsServive {

	@Autowired
	CustomerDetailsRepository custrepo;

	@Override
	public void addCustomer(CustomerDetails cust) {
		Optional<CustomerDetails> customerdetails = custrepo.findById(cust.getCustomerID());
		System.out.println(customerdetails);
		if (!customerdetails.isEmpty())
			throw new CustomerAlreadyExistException();
		custrepo.save(cust);
	}

	@Override
	public List<CustomerDetails> viewAllCusts() {
		return custrepo.findAll();
	}

	@Override
	public Optional<CustomerDetails> getCustByID(int customerID) {
		Optional<CustomerDetails> cust = custrepo.findById(customerID);
		if (cust.isEmpty())
			throw new CustomerNotFoundException();
		return cust;
	}

	@Override
	public void updateCustomer(CustomerDetails cust) {
		custrepo.save(cust);

	}

}
