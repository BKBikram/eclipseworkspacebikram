package com.employee.exception.handler;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employee.dto.ServiceResponse;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BindingResult result=ex.getBindingResult();
		List<ObjectError> allErrors=result.getAllErrors();
		List<JSONObject> errorList=new ArrayList<JSONObject>();
		for(ObjectError error:allErrors) {
			JSONObject json=new JSONObject();
			FieldError fieldError=(FieldError) error;
			json.put(fieldError.getField(),messageSource.getMessage(error,request.getLocale()));
			errorList.add(json);
		}
		ServiceResponse response=new ServiceResponse("validation Failed","vallercod", errorList);
		return new ResponseEntity<> (response,HttpStatus.OK);
		
	}
	

}
