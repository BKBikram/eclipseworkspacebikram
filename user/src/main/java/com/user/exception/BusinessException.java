package com.user.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException {
	
	private String errorMessage;
	private String errorPath;
	private HttpStatus status;
	private Date timestamp;
	

}
