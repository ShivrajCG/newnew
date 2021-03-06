package com.cg.incentive.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.incentive.entities.CarCompany;
import com.cg.incentive.service.CarCompanyServiceImpl;

@RestController
@RequestMapping("/serv")
public class CarCompanyController {
	@Autowired
	CarCompanyServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addCarCompany(@RequestBody CarCompany serv) {
		service.addCarCompany(serv);
		return new ResponseEntity<String>("added", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<CarCompany>> viewCarCompany() {
		List<CarCompany> carcompany = service.viewCarCompany();
		return new ResponseEntity<List<CarCompany>>(carcompany, HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<CarCompany>> viewCarModel() {
		List<CarCompany> carmodel = service.viewCarModel();
		return new ResponseEntity<List<CarCompany>>(carmodel, HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<CarCompany>> viewChasisNo() {
		List<CarCompany> chasisno = service.viewCarCompany();
		return new ResponseEntity<List<CarCompany>>(chasisno, HttpStatus.OK);
	}
	

}
