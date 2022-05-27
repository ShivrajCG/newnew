package com.cg.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.incentive.entities.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {
	@Query(value = "select cust from CustomerDetails cust where cust.customerID=?1")
	CustomerDetails getCustByID(int customerID);
}
