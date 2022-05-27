package com.student.exception;

public class RecordCreateException extends Exception{

	private static final long serialVersionUID = 1L;
	public RecordCreateException(String message,Throwable cause,Boolean enableSuppression,
			Boolean enableStackTrace) {
		super(message,cause,enableSuppression,enableStackTrace);
	}
	
	public RecordCreateException(String message,Throwable cause) {
		super(message,cause);
	}
	public RecordCreateException(String message) {
		super(message);
	}
	public RecordCreateException(Throwable cause) {
		super(cause);
	}
	

}
