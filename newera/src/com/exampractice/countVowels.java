package com.exampractice;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			//char[] ch=name.toCharArray();
			if(name.charAt(i)=='a' || name.charAt(i)=='e'||name.charAt(i)=='i' || 
					name.charAt(i)=='o'||name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || 
					name.charAt(i)=='I' ||
					name.charAt(i)=='O' || name.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("The no of vowels present in your name is:"+count);
	}

}
