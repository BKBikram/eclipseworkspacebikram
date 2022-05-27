package com.exampractice;

import java.util.Scanner;

public class arraypro {

	public static void main(String[] args) {
		//wap to create an integer array of 5 element and display the total no of positive element present in the array
		Scanner sc=new Scanner(System.in);
		System.out.println("how many number do you want to store:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		int count=0,neg=0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=1)
			{
				count++;
			}
			else
				neg++;		
		}
		System.out.println("positive nos are:"+count);

	}

}
