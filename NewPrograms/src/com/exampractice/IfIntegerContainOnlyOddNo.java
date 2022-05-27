package com.exampractice;

import java.util.Scanner;

public class IfIntegerContainOnlyOddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0,rem=0,odd=0;
		while(n!=0)
		{
				rem=n%10;
				if(rem%2!=0)
				{
					odd++;
				}
				n=n/10;
				count++;
		}
		if(count==odd)
			System.out.println("all integers are odd");
		else
			System.out.println("all integers are not odd");
		

	}

}
