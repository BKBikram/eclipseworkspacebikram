package com.exampractice;

import java.util.Scanner;

public class swapno {
	public static void main(String[] args) {
		System.out.println("Enter two no:");
		Scanner sc=new Scanner(System.in);
		int c;
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("After swaping the value is");
		c=n;
		n=n1;
		n1=c;
		System.out.println(n+" "+n1);
		
	}

}
