package com.exampractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int d=2;
		int n=sc.nextInt();
		while(n>d)
		{
			if(n%d==0)
				break;
			d=d+1;
		}
		if(n==d)
			System.out.println("prime n");

	}

}
