package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import com.cg.incentive.entities.CarDetails;
import com.cg.incentive.exceptions.CarDetailsAlreadyExistException;
import com.cg.incentive.exceptions.CarDetailsNotFoundException;

public interface CarDetailsService {
	void addCarDetails(CarDetails det) throws CarDetailsAlreadyExistException;

	List<CarDetails> viewAllCarDetails();

	Optional<CarDetails> getCarById(int carChassisNo) throws CarDetailsNotFoundException;

	void updateCarDetails(CarDetails det);

	void deleteCarDetails(int carChassisNo);
}
