package com.exampractice;

import java.util.Scanner;

public class CountSpecicalChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String line=sc.nextLine();
		int alpha=0,num=0,specl=0;
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
			{
				alpha++;
			}
			
			else {
				specl++;
			}
		}
		System.out.println(specl);

	}

}
