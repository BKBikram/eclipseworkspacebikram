package com.exampractice;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		StringBuffer sb=new StringBuffer(name);
		StringBuffer rev=sb.reverse();
		String rev1=new String(rev);
		System.out.println(rev1);
		if(name.equals(rev1))
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		

	}

}
