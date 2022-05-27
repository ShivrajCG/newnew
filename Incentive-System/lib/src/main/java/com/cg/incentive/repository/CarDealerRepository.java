package com.cg.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.incentive.entities.CarDealer;

@Repository
public interface CarDealerRepository extends JpaRepository<CarDealer, Integer> {
	@Query(value = "select deal from CarDealer deal where deal.dealerID=?1")
	CarDealer getDealerById(int dealerID);
}
