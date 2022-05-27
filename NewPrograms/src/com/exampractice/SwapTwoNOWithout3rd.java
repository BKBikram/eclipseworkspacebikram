package com.exampractice;

import java.util.Scanner;

public class SwapTwoNOWithout3rd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping");
		System.out.println(a+" "+b);
		 
		

	}

}
