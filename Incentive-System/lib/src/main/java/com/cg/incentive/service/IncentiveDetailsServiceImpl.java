package com.cg.incentive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.incentive.entities.IncentiveDetails;
import com.cg.incentive.repository.IncentiveDetailsRepository;

@Service
public class IncentiveDetailsServiceImpl implements IncentiveDetailsService{
	@Autowired
	IncentiveDetailsRepository incdetrepo;
	@Override
	public void addIncentiveDetails(IncentiveDetails incdet) {
		
		incdetrepo.save(incdet);
	}

}
