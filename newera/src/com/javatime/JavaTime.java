package com.javatime;

import java.time.LocalTime;

public class JavaTime {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		int hr=lt.getHour();
		int mn=lt.getMinute();
		int sec=lt.getSecond();
		System.out.format("%d:%d:%d",hr,mn,sec);

	}

}
