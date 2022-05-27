package com.exampractice;

import java.util.Scanner;

public class divisibleby {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no for multiplication tabel");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(2000);
			System.out.println(n+"*"+i+"="+n*i);
		}

	}
}
