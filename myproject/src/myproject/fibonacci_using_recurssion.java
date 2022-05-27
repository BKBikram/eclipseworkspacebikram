package myproject;

import java.util.Scanner;

public class fibonacci_using_recurssion {
	      static int no1=0,no2=1,no3;
	   static void fib(int n) {
		   if(n>0) {
		   no3=no1+no2;
		   no1=no2;
		   no2=no3;
		   System.out.println(no3);
		   fib(n-1);
		   }
		   
		   
	   }
	public static void main(String[] args) {
		System.out.println("Enter the term for fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println(a+" "+b);
		fib(n-2);
		
	}

}
