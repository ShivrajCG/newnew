package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import com.cg.incentive.entities.CarDealer;
import com.cg.incentive.exceptions.DealerAlreadyExistException;
import com.cg.incentive.exceptions.DealerNotFoundException;

public interface CarDealerService {
	void addCarDealer(CarDealer deal) throws DealerAlreadyExistException;

	List<CarDealer> viewAllDealers();

	Optional<CarDealer> getDealerById(int dealerID) throws DealerNotFoundException;

	void updateDealer(CarDealer deal);

	void deleteDealer(int dealerID);
}
