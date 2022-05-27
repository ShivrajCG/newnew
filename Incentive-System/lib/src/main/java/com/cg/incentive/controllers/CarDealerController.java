package com.cg.incentive.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.incentive.entities.CarDealer;
import com.cg.incentive.service.CarDealerServiceImpl;

@RestController
@RequestMapping("/deal")
public class CarDealerController {
	@Autowired
	CarDealerServiceImpl service;

	@PostMapping
	public ResponseEntity<String> addDealer(@RequestBody CarDealer deal) {
		service.addCarDealer(deal);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<CarDealer>> getAllDealers() {
		List<CarDealer> dealerList = service.viewAllDealers();
		return new ResponseEntity<List<CarDealer>>(dealerList, HttpStatus.OK);
	}

	@GetMapping("/id/{dealerID}")
	public ResponseEntity<Optional<CarDealer>> getDealerById(@PathVariable int dealerID) {
		Optional<CarDealer> deal = service.getDealerById(dealerID);
		return new ResponseEntity<Optional<CarDealer>>(deal, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String> editCarDealer(@RequestBody CarDealer deal) {
		service.updateDealer(deal);
		return new ResponseEntity<String>("updated", HttpStatus.OK);
	}

	@DeleteMapping("/id/{deptno}")
	public ResponseEntity<String> deleteCarDealer(@PathVariable int dealerID) {
		service.deleteDealer(dealerID);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
}
