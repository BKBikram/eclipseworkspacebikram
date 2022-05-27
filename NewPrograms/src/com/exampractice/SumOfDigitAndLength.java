package com.exampractice;

import java.util.Scanner;

public class SumOfDigitAndLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0,sum=0,len=0;
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		while(n!=0)
		{
			len++;
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		System.out.println("Length of the digit is"+len);
		System.out.println("Sum is"+sum);

	}

}
