package com.exampractice;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String rev="";
		char[] ch=name.toCharArray();
//		for(int i=name.length()-1;i>=0;i--)
//		{
//		   rev=rev+name.charAt(i);
//		}
//		if(name.equals(rev))
//			System.out.println("pallindrome");
//		else
//			System.out.println("not pallindrme");
		
		StringBuffer sb=new StringBuffer(name);
		StringBuffer s=sb.reverse();
	    
	    String ne=new String(s);
		if(name.equals(ne))
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		

	}

}
