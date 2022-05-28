package com.cg.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.incentive.entities.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {

}
