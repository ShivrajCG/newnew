package com.cg.incentive.service;

import java.util.List;

import com.cg.incentive.entities.CarCompany;
import com.cg.incentive.exceptions.CarCompanyAlreadyExistException;

public interface CarCompanyService {
	void addCarCompany(CarCompany comp) throws CarCompanyAlreadyExistException;

	List<CarCompany> viewCarModel();
	List<CarCompany> viewChasisno();
	
	void updateCarCompany(CarCompany comp);

}
