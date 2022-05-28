package com.cg.incentive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarDetailsExceptionHandler {
	
	@ExceptionHandler(value = CarDetailsNotFoundException.class)
	public ResponseEntity<Object> exception( CarDetailsNotFoundException exception) {
		return new ResponseEntity<Object>("Car details not found...", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = CarDetailsAlreadyExistException.class)
	public ResponseEntity<Object> exception(CarDetailsAlreadyExistException exception) {
		return new ResponseEntity<Object>("Car details Already Exists...", HttpStatus.NOT_FOUND);


}
}
