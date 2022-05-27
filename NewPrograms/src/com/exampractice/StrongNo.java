package com.exampractice;

import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int rem=0,fact,sum=0;
		int n=sc.nextInt();
		int org=n;
		while(n!=0)
		{
			fact=1;
			 rem=n%10;
			 for(int i=1;i<=rem;i++)
			 fact=fact*i;
			 sum = sum+fact;
			 n=n/10;
		}
		System.out.println(sum);
		if(sum==org)
			System.out.println("Strong no");
		else
			System.out.println("not strong");
			
	}
	

}
