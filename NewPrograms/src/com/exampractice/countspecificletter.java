package com.exampractice;

import java.util.Scanner;

public class countspecificletter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		int count=0;
		String name=sc.nextLine();
		System.out.println("Enter the word for occurance:");
		char na=sc.next().charAt(0);
		//char[] ar=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==na)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
