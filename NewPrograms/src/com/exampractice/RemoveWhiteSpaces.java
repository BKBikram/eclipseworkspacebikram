package com.exampractice;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String line=sc.nextLine();
//        String nl=line.replaceAll(" ", "");
//        System.out.println(nl);
        
        
        //Or
		for(int i=0;i<line.length();i++)
		{
			char ch[]=line.toCharArray();
			if(ch[i]==' ')
				continue;
			System.out.print(ch[i]);
		}
        
	}

}
