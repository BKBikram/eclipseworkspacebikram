package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMultipleDuplicates {

	public static void main(String[] args) {
		//in an array 1-100 numbers are stored and multiple duplicates store and find the multiple duplicates
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no do you want to store:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate numbers are:"+arr[j]);
				}
			}
		}

	}

}
