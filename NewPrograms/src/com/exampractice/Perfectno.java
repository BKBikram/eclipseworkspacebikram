package com.exampractice;

import java.util.Scanner;

public class Perfectno {

	//display all perfect no between 1 to 500
	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a no to check no is perfect or not:");
		//int n=sc.nextInt();
		
		for(int i=1;i<500;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
			   if(i%j==0)
				 sum=sum+j;
			}
		if(sum==i)
			System.out.println(i);
		}
		
			
//		if(sum==n)
//			System.out.println("perfect no");
//		else
//			System.out.println("not perfect");

	}

}
