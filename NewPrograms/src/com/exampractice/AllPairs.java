package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class AllPairs {

	public static void main(String[] args) {
		//how to find all pairs in array of integers who sum is equal to given integer
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
		System.out.println("Enter the number to check the sum pairs");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num && i!=j)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
