package com.StudentDetails.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(InvalidAgeException.class)
	public ResponseEntity<Object> ageIsInvalid(InvalidAgeException ae){
		return new ResponseEntity<Object>("Please Enter Valid Age",HttpStatus.BAD_REQUEST);
		
	}

}
