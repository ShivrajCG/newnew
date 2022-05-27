package com.cg.incentive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DealerExceptionHandler {
	@ExceptionHandler(value = DealerNotFoundException.class)
	public ResponseEntity<Object> exception(DealerNotFoundException exception) {
		return new ResponseEntity<Object>("Dealer not found...", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = DealerAlreadyExistException.class)
	public ResponseEntity<Object> exception(DealerAlreadyExistException exception) {
		return new ResponseEntity<Object>("Dealer Already Exists...", HttpStatus.NOT_FOUND);
	}
}
