package com.example.app.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EntryException.class)
	public ResponseEntity<ExceptionDetails> customerExceptionHandler(EntryException e, WebRequest w) {
		ExceptionDetails details = new ExceptionDetails();
		details.setDate(LocalDate.now());
		details.setMessage(e.getMessage());
		details.setDetails(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionDetails> validationExceptionExceptionHandler(MethodArgumentNotValidException e, WebRequest w) {
		ExceptionDetails details = new ExceptionDetails();
		details.setDate(LocalDate.now());
		details.setMessage(e.getFieldError().getDefaultMessage());
		details.setDetails(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> anyExceptionHandler(Exception e, WebRequest w) {
		ExceptionDetails details = new ExceptionDetails();
		details.setDate(LocalDate.now());
		details.setMessage(e.getMessage());
		details.setDetails(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionDetails> noHandlerFoundExceptionExceptionHandler(NoHandlerFoundException e, WebRequest w) {
		ExceptionDetails details = new ExceptionDetails();
		details.setDate(LocalDate.now());
		details.setMessage(e.getMessage());
		details.setDetails(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	
}
