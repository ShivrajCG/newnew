package com.cg.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.incentive.entities.IncentiveDetails;

@Repository
public interface IncentiveDetailsRepository extends JpaRepository<IncentiveDetails, Integer> {

}
