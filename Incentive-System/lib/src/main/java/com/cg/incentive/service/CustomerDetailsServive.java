package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import com.cg.incentive.entities.CustomerDetails;
import com.cg.incentive.exceptions.CustomerAlreadyExistException;
import com.cg.incentive.exceptions.CustomerNotFoundException;

public interface CustomerDetailsServive {
	void addCustomer(CustomerDetails cust) throws CustomerAlreadyExistException;

	List<CustomerDetails> viewAllCusts();

	Optional<CustomerDetails> getCustByID(int customerID) throws CustomerNotFoundException;

	void updateCustomer(CustomerDetails cust);

}
