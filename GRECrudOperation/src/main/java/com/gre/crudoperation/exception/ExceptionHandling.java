package com.gre.crudoperation.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ExceptionHandling {

	
	
	
	/*
	 * Not Found GLOBALLY exception HANDLING
	 * handle No Such Element Exception
	 */
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex) {
        // Customize the response for NoSuchElementException
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource ID not found");
    }
	
	
	
	
	
	/*
	 * Not Found GLOBALLY EVERYEVER  exception HANDLING
	 * handle No Such Element Exception
	 */
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String errorMessage = "Invalid argument type: " + ex.getName();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
	
	
	
}
