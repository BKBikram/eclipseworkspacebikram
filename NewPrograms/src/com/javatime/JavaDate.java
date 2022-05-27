package com.javatime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class JavaDate {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		int month=date.getDayOfMonth();
		int year=date.getDayOfYear();
		int mon=date.getMonthValue();   //it will print first month or second or so on...
		Month mont=date.getMonth();
		int y=date.getYear();
		DayOfWeek week=date.getDayOfWeek();
		System.out.println("month is"+month);
		System.out.println("year is"+year);
		System.out.println("day is="+mon);
		System.out.println("mont"+mont);
		System.out.println("y is"+y);

	}

}
