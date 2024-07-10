package com.Student.customException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Student.NameException.NameNotFoundException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeNotMatchException.class)
	public ResponseEntity<Object> ageNotmatch(AgeNotMatchException ae){
		return new ResponseEntity<Object>("Please enter Valid Age",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object>nameNomatch(NameNotFoundException e){
		return new ResponseEntity<Object>("Please Enter Valid Name",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> IdNot(IdNotFoundException i){
		return new ResponseEntity<Object>("Please Enter Valid Id Number",HttpStatus.BAD_REQUEST);
		
	}

}
