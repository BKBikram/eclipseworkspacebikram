package com.exampractice;

import java.util.Scanner;

public class PallindromeNoO {

	public static void main(String[] args) {
		System.out.println("Enter a Number to check no is pallindrome or not:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int rem=0,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==org)
			System.out.println("pallindrome no");
		else
			System.out.println("not pallindrome no");

	}

}
