package com.exampractice;

import java.util.Scanner;

public class SeriesPrint {

	public static void main(String[] args) {
		// print the series like 1,4,9,16,25,36,49,64 so on
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range for printing the square");
		int n=sc.nextInt();
		int mul=0;
		for(int i=1;i<n;i++)
		{
			mul=i*i;
			System.out.println(mul);
		}

	}

}
