package com.exampractice;

import java.util.Scanner;

public class PrintAllSmallIntocap {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		for(int i=0;i<name.length();i++)
		{
			char[] ch=name.toCharArray();
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char) (ch[i]-32);
				System.out.print(ch[i]);
			}
		}

	}

}
