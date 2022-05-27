package com.exampractice;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int n=sc.nextInt();
		System.out.println("Enter the operator");
		String op=sc.next();
		System.out.println("Enter the Second number:");
		int n1=sc.nextInt();
		switch(op)
		{
		case "+":
			System.out.println(n+n1);
	        break;
		case "-":
			System.out.println(n-n1);
			break;
		case "*":
			System.out.println(n*n1);
			break;
		case "%":
			System.out.println(n%n1);
			break;
			
		case "/":
			try {
			System.out.println(n/n1);
		    }
			catch(Exception e)
			{
				System.out.println("0 can not be divided");
			}
			break;
		default:
			System.out.println("Enter a valid operator");
		}

	}

}
