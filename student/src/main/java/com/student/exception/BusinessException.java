package com.student.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BusinessException {
	
	private String path;
	private String errorMessage;
	private HttpStatus errorCode;
	private Date timestamp;

}
