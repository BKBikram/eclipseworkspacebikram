package com.exampractice;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
	/*	char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	*/
		//using StringBuffer class
	StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		if(sb.equals(name))
			System.out.println("pallindrme");
		else
			System.out.println("not pallindrome");
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
