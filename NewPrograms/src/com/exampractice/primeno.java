package com.exampractice;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		System.out.println("Enter a no to check prime or not:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=2;
		while(d<n)
		{
			if(n%d==0)
				break;
			d=d+1;
		}
		if(d==n)
		{
			System.out.println("prime no");
		}
		else
			System.out.println("not prime");

	}

}
