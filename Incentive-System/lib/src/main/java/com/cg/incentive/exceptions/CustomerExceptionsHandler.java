package com.cg.incentive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionsHandler {
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<Object> exception(CustomerNotFoundException exception) {
		return new ResponseEntity<Object>("Customer not found...", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = CustomerAlreadyExistException.class)
	public ResponseEntity<Object> exception(CustomerAlreadyExistException exception) {
		return new ResponseEntity<Object>("Customer Already Exists...", HttpStatus.NOT_FOUND);
	}
}