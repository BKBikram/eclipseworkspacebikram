package com.arraylist;

import java.util.Scanner;

public class digitlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read number and check whether it is a one digit,two digit,three digit,four digit or five digit number 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int len=0,rem=0;
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			len++;
			n=n/10;
		}
		System.out.println("The no length is"+len);

	}

}
