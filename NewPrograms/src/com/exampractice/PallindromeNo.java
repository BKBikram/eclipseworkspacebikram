package com.exampractice;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int rem=0,rev=0;
		int org=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(org==rev)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrom");
		

	}

}
