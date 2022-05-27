package com.practice8.exception.handler;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.practice8.dto.ServiceResponse;
import com.practice8.exception.EmployeeNotFoundException;
import com.practice8.util.Constants;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	@Autowired
	private MessageSource messageSource;
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BindingResult result=ex.getBindingResult();
		List<ObjectError> allerrors=result.getAllErrors();
		List<JSONObject> details=new ArrayList<JSONObject>();
		for(ObjectError error:allerrors) {
			JSONObject obj=new JSONObject();
			FieldError fieldError=(FieldError) error;
			obj.put(fieldError.getField(),messageSource.getMessage(error,request.getLocale()));
			details.add(obj);
		}
		ServiceResponse response=new ServiceResponse(messageSource.getMessage("msg001",null,LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.VALLERCOD, details);
		return new ResponseEntity<Object>(response,status.OK);
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> handleEmployeeNotFound(EmployeeNotFoundException ex){
		HttpStatus status=HttpStatus.NOT_FOUND;
		return new ResponseEntity<Object>(errorJson(ex, status),status);
	}
	
	private String errorJson(Exception e,HttpStatus status) {
		JSONObject obj=new JSONObject();
		obj.put("status", status.value());
		obj.put("error", status.getReasonPhrase());
		obj.put("message", e.getMessage().split(":")[0]);
		return obj.toString();
	}

	
	
	

}
