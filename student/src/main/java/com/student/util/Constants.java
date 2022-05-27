package com.student.util;

public class Constants {

	public static final String ALPHA_NUMER_SPACES = "^[a-zA-Z0-9 ]+$";
	public static final String PATTERN_ARABIC = "^[\u0621-\u064A\u0660-\u06690-9a-zA-Z ]+$";
	public static class MESSAGE_STATUS {
		public static final String VERIFIED = "VERIFIED";
		public static final String PROCESSED = "PROCESSD";
		public static final String SUCCESS = "SUCCESS";
		public static final String DELETED = "DELETED";
		public static final String FAILED = "FAILED";
		
	}

	public static class VALID {
		public static final String PATTERN_ALPHA_NUMERICS = "^[\u0621-\u064A\u0660-\u06690-9a-zA-Z]+$";
		public static final String PATTERN_USER_NAME = "^[0-9a-zA-Z ]+$";
		public static final String PATTERN_CR_NO = "^[0-9]+$";
		public static final String PATTERN_COMPANY_NAME = "^[\u0621-\u064A\u0660-\u0669a-zA-Z,. 0-9]+$";
		public static final String PATTERN_CELL_NO = "^[0-9]+$";
		public static final String PATTERN_CELL_NO2 = "^[0-9]{12}$";
		public static final String PATTERN_CELL_NO3 = "^[0-9]{10}";
		public static final String NUMERS = "^[0-9]+$";
		public static final String YEAR = "^[0-9]{4,}$";
		public static final String PATTERN_EMAIL ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9]$";
		public static final String PATTERN__NO_ONLY = "^[0-9]+$";
		public static final String PATTERN_ALPHA_NUMERICS_SPECIAL="^[A-Za-z0-9_@./#&+-]*$";
		public static final String PATTERN_PASSWORDOLD="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&.]{8,}$";
		public static final String PASSWORD_SPECIAL_CHARS = "@#$%^`<>&+=\"!ºª·#~%&'¿¡€,:;*/+-.=_\\[\\]\\(\\)\\|\\_\\?\\\\";
		public static final int PASSWORD_MIN_SIZE = 8;
		public static final String PATTERN_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[" + PASSWORD_SPECIAL_CHARS + "])(?=\\S+$).{" + PASSWORD_MIN_SIZE + ",}$";
		public static final String PATTERN_ALPHA_NUMERICS_COMMA = "^[\u0621-\u064A\u0660-\u06690-9a-zA-Z, ]+$";
		public static final String PATTERN_ALPHA_NUMERICS_COMMA_STOP = "^[\u0621-\u064A\u0660-\u06690-9a-zA-Z,. ]+$";
		public static final String PATTERNACTIVITY_ALPHA_NUMERICS_COMMA_STOP = "^[\u0621-\u064A\u0660-\u06690-9a-zA-Z,.!()-? ]+$";
		public static final String PATTEN_URL = "(http(s)?:\\/\\/.)?(www\\.)?[-a-zA-Z0-9@:%.\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%\\+.~#?&//=]*)";
		public static final String PATTERN_YEAR = "^[1-9]{1}[0-9]{3}+$";
	}



	
	
	
	

	
}
