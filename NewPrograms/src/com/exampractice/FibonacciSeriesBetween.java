package com.exampractice;

import java.util.Scanner;

public class FibonacciSeriesBetween{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the starting point for fibonacci");
		 int a=sc.nextInt();
		 System.out.println("Enter the end point for fibonacci series");
		 int end=sc.nextInt();
		 System.out.print(a+"\t");
		 int b=a+1,c=0;
		 System.out.print(b+" ");
		 for(int i=a;i<end;i++)
		 {
			 c=a+b;
			 if(c>=end)
				 break;
			 System.out.print(c+"\t");
			 a=b;
			 b=c;	 	 
		 }
	 }
}
