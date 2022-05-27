package com.arraylist;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take input of age of 3 people by user and determine oldest and youngest among them.
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("oldest"+a);
		}
		else if(b>a && b>c)
		System.out.println("oldest"+b); 
		else if(c>a && c>b)
			System.out.println("oldest"+c);
		if(a<b && a<c)
			System.out.println("youngest" +a);
		else if(b<a && b<c)
			System.out.println("youngest"+b);
		else
			System.out.println("youngest"+c);
	}
}

