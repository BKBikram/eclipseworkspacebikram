package com.exampractice;

import java.util.Scanner;

public class FibonacciS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0,b=1,c=0;
//		for(int i=0;i<50;i++)
//		{
//			a=b;
//			b=c;
//			if(c>=50)
//				break;
//			System.out.println(c+" ");
//			c=a+b;
//		}
		
		int c=0;
		System.out.println("Enter the first range");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the last range:");
		int last=sc.nextInt();
		int b=a+1;
		System.out.print(a+" "+b);
		for(int i=a;i<=last;i++)
		{
			c=a+b;
			if(c>=last)
				break;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}

}
