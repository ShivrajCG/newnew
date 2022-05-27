package com.cg.incentive.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.incentive.repository.CarDetailsRepository;

public class CarDetailsServiceImpl implements CarDetailsService {
	@Autowired
	CarDetailsRepository cardetrepo;

	@Override
	public int viewChasisno() {
		
		return viewChasisno();
	}

	@Override
	public String viewCarModel() {
		
		return viewCarModel();
	}

	@Override
	public double viewCarPrice() {
		
		return viewCarPrice();
	}

	@Override
	public String viewCarSpecifications() {
		
		return viewCarSpecifications();
	}

}
