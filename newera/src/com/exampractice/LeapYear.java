package com.exampractice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year to leap year or not;");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%400==0)
		System.out.println("leap year");
		else if(year%100==0)
			System.out.println("not a leap year");
		else if(year%4==0)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}

}
