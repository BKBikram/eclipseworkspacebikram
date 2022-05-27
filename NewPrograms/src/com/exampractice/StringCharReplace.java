package com.exampractice;

import java.util.Scanner;

public class StringCharReplace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name="Biplab";
		System.out.println("Enter the character which u want to replace");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<name.length();i++)
		{
			char[] ch=name.toCharArray();
			if(ch[i]==ch1)
			{
				ch[i]='*';
			}
			System.out.print(ch[i]);
			
		}
		
	}

}
