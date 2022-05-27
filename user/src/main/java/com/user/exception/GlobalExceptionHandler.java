package com.user.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,
			WebRequest request){
		BusinessException businessException=new BusinessException(exception.getMessage(),
				request.getDescription(false),HttpStatus.NOT_FOUND,new Date());
		return new ResponseEntity(businessException,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception,
			WebRequest request){
	BusinessException businessException=new BusinessException(request.getDescription(false),exception.getMessage(),HttpStatus.NOT_FOUND,new Date());
       return new ResponseEntity(businessException,HttpStatus.INTERNAL_SERVER_ERROR);
   }

}
