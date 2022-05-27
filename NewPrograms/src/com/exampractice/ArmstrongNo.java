package com.exampractice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no to whether the no is armstrong or not:");
		int n=sc.nextInt();
		double sum=0;
		int ctr=0;
		int temp=n;
		while(n!=0)
		{
			ctr++;
			n=n/10;
		}
		n=temp;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(Math.pow(rem,ctr));
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong no");
		else
			System.out.println("not armstrong");

	}

}
