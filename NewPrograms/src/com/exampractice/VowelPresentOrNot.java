package com.exampractice;

import java.util.Scanner;

public class VowelPresentOrNot {

		public static void main(String[] args) {
			int vowel=0,otherword=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a line");
			String line=sc.nextLine();
			System.out.println(line.length());
			for(int i=0;i<line.length();i++)
			{
				char ch=line.charAt(i);
				if(ch=='a' || ch== 'e'||ch=='i' || ch== 'o'||ch=='u' || ch== 'A'||
						ch=='E' || ch== 'I'||ch=='O' || ch== 'U')
				{
				   System.out.println("vowel");
				}
				else 
					otherword++;
			}
			

		}

	}

