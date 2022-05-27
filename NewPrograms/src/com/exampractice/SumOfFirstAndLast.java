package com.exampractice;

import java.util.Scanner;

public class SumOfFirstAndLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rem=0,rev=0;
		int last_digit=n%10;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		int first_digit=rev%10;
		int sum=first_digit+last_digit;
		System.out.println(sum);
		
	}

}
