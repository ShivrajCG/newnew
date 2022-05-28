package com.cg.incentive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarCompanyExceptionHandler {
	@ExceptionHandler(value = CarCompanyNotFoundException.class)
	public ResponseEntity<Object> exception( CarCompanyNotFoundException exception) {
		return new ResponseEntity<Object>("Car company not found...", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = CarCompanyAlreadyExistException.class)
	public ResponseEntity<Object> exception(CarCompanyAlreadyExistException exception) {
		return new ResponseEntity<Object>("Car company Already Exists...", HttpStatus.NOT_FOUND);

}
}