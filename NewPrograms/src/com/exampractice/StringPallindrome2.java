package com.exampractice;

import java.util.Scanner;

public class StringPallindrome2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String rev="";
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);

	}

}
