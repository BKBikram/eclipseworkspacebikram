package com.student.exception;

public class RecordUpdateException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public RecordUpdateException(String message,Throwable cause,Boolean enableSuppression,Boolean enableStackTrace) {
		
		super(message,cause, enableSuppression,enableStackTrace);
	}
	
	public RecordUpdateException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public RecordUpdateException(String message) {
		super(message);
	}
	public RecordUpdateException(Throwable cause) {
		super(cause);
	}
	

}
