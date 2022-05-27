package com.arraylist;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		//implement calculator using switch
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a=sc.nextInt();
		System.out.println("Enter operator");
		String s=sc.next();
		System.out.println("enter 2nd no");
		int b=sc.nextInt();
	//try {
		switch(s)
		{
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "%":
			System.out.println(a%b);
			break;
	      
		case "/":
			try {
			System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
			}
	       }
	     //}
	     //catch(Exception e){
		 //System.out.println(e);
		     }
		//default:
			//System.out.println("Enter valid operator");
		}
	
	
			
			
		/*
		 * //Using if-else if(s.equals("+")) System.out.println(a+b); else
		 * if(s.equals("-")) System.out.println(a-b); else if(s.equals("*"))
		 * System.out.println(a*b); else if(s.equals("%")) System.out.println(a%b); else
		 * if(s.equals("/")) System.out.println(a/b); else
		 * System.out.println("Enter a valid operator");
		 */

	//}

