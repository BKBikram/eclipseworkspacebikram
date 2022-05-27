package com.exampractice;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		System.out.println("Enter a no for factorial:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	       int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
