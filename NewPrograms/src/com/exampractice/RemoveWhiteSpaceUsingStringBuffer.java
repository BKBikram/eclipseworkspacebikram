package com.exampractice;

import java.util.Scanner;

public class RemoveWhiteSpaceUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String line=sc.nextLine();
		StringBuffer sb=new StringBuffer(line);
		for(int i=0;i<sb.length();i++)
		{
			char ch=sb.charAt(i);
			if(ch==' ')
				continue;
			System.out.print(ch);
			
		}

	}

}
