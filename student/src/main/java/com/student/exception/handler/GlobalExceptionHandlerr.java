package com.student.exception.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.TypeMismatchException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.student.dto.ServiceResponse;

public class GlobalExceptionHandlerr extends ResponseEntityExceptionHandler{
	
	private final MessageSource messageSource;
	private static final String UNEXPECTED_ERROR="Exception.unexpected";
	
	@Autowired
	public GlobalExceptionHandlerr(MessageSource messageSource) {
		this.messageSource=messageSource;
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		List<JSONObject> details = new ArrayList<>();
		ServiceResponse error = new ServiceResponse(ex.getMessage(),
				messageSource.getMessage(UNEXPECTED_ERROR, null, LocaleContextHolder.getLocale()), details);
		return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NoSuchMessageException.class)
	public final ResponseEntity<Object> handleNoSuchMessageExceptions(Exception ex, WebRequest request) {
		List<JSONObject> details = new ArrayList<>();
		ServiceResponse error = new ServiceResponse(ex.getMessage(),
				messageSource.getMessage(UNEXPECTED_ERROR, null, LocaleContextHolder.getLocale()), details);
		return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({ MethodArgumentTypeMismatchException.class, TypeMismatchException.class})
	public ResponseEntity<Map<String, String>> handleException(TypeMismatchException ex) {
		List<JSONObject> details = new ArrayList<>();
		ServiceResponse error = new ServiceResponse(ex.getMessage(),
				messageSource.getMessage(ex.getMessage(), null, LocaleContextHolder.getLocale()), details);
		return new ResponseEntity(error, HttpStatus.OK);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		BindingResult result = ex.getBindingResult();
		List<ObjectError> allErrors = result.getAllErrors();
		List<JSONObject> errorList = new ArrayList<>();
		for (ObjectError objectError : allErrors) {
			JSONObject obj = new JSONObject();
			FieldError fieldError = (FieldError) objectError;
			obj.put(fieldError.getField(), messageSource.getMessage(objectError, request.getLocale()));
			errorList.add(obj);
		}
		/*
		 * List<String> errorMessages = result.getAllErrors().stream() .map(objectError
		 * -> messageSource.getMessage(objectError, request.getLocale()))
		 * .collect(Collectors.toList());
		 */
		ServiceResponse error = new ServiceResponse("VALERRCOD", "Validation Failed", errorList);
		return new ResponseEntity<>(error, HttpStatus.OK);
	}
	

}
