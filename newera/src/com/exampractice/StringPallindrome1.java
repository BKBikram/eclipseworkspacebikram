package com.exampractice;

import java.util.Scanner;

public class StringPallindrome1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev))
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");

	}

}
