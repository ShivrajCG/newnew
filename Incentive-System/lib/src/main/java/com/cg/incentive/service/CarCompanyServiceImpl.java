package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.incentive.entities.CarCompany;
import com.cg.incentive.exceptions.CarCompanyAlreadyExistException;
import com.cg.incentive.exceptions.CustomerAlreadyExistException;
import com.cg.incentive.repository.CarCompanyRepository;

public class CarCompanyServiceImpl implements CarCompanyService {
	@Autowired
	CarCompanyRepository comprepo;

	@Override
	public void addCarCompany(CarCompany comp) throws CarCompanyAlreadyExistException {
		Optional<CarCompany> carcompanyname = comprepo.findOne(comp.getCarCompanyName());
		System.out.println(carcompanyname);
		if (!carcompanyname.isEmpty())
			throw new CustomerAlreadyExistException();
		comprepo.save(comp);	
	}

	@Override
	public List<CarCompany> viewCarModel() {
		return comprepo.findAll();
	}

	@Override
	public List<CarCompany> viewChasisno() {
		return comprepo.findAll();
	}

	@Override
	public void updateCarCompany(CarCompany comp) {
		comprepo.save(comp);	
	}

	public List<CarCompany> viewCarCompany() {
		return comprepo.findAll();
	}

}
