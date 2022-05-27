package com.cg.incentive.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.incentive.entities.CarCompany;

public interface CarCompanyRepository extends JpaRepository<CarCompany, Integer>{

	Optional<CarCompany> findOne(String carCompanyName);

}