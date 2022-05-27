package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.incentive.entities.CarDealer;
import com.cg.incentive.exceptions.DealerAlreadyExistException;
import com.cg.incentive.exceptions.DealerNotFoundException;
import com.cg.incentive.repository.CarDealerRepository;

@Service
public class CarDealerServiceImpl implements CarDealerService {

	@Autowired
	CarDealerRepository dealrepo;

	@Override
	public void addCarDealer(CarDealer deal) throws DealerAlreadyExistException {
		Optional<CarDealer> cardealer = dealrepo.findById(deal.getDealerID());
		System.out.println(cardealer);
		if (!cardealer.isEmpty())
			throw new DealerAlreadyExistException();
		dealrepo.save(deal);

	}

	@Override
	public List<CarDealer> viewAllDealers() {
		return dealrepo.findAll();
	}

	@Override
	public Optional<CarDealer> getDealerById(int dealerID) throws DealerNotFoundException {
		Optional<CarDealer> deal = dealrepo.findById(dealerID);
		if (deal.isEmpty())
			throw new DealerNotFoundException();
		return deal;
	}

	@Override
	public void updateDealer(CarDealer deal) {
		dealrepo.save(deal);

	}

	@Override
	public void deleteDealer(int dealerID) {
		dealrepo.deleteById(dealerID);
	}

}
